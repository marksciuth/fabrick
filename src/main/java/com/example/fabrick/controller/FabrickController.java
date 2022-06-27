package com.example.fabrick.controller;

import com.example.fabrick.model.*;
import com.example.fabrick.model.entity.*;
import com.example.fabrick.model.wrapper.WrapperResponseMoneyTransfer;
import com.example.fabrick.model.wrapper.WrapperSaldo;
import com.example.fabrick.model.wrapper.WrapperTransazione;
import com.example.fabrick.repository.ResponseTransferService;
import com.example.fabrick.repository.SaldoService;
import com.example.fabrick.repository.TransazioneService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/fabrick")
@Slf4j
public class FabrickController {

    @Autowired
    private SaldoService serviceSaldo;

    @Autowired
    private TransazioneService serviceTransazione;

    @Autowired
    private ResponseTransferService serviceResponseTransfer;

    @Value("${api.key}")
    private String apiKey;

    @RequestMapping(value="/saldo/{accountId}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Saldo getBalance(@PathVariable("accountId") Long accountId){

        try {
            String uriSandBox = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/" + accountId + "/balance";

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Auth-Schema", "S2S");
            headers.add("apiKey", apiKey);
            HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

            ResponseEntity<String> response = restTemplate.exchange(uriSandBox, HttpMethod.GET,entity, String.class);

            log.info("Connessione alla sandbox");

            WrapperSaldo data = null;
            try {

                data = new ObjectMapper()
                        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                        .readValue(response.getBody(), WrapperSaldo.class);

                log.info("Dati ottenuti correttamente");

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            Saldo saldo = data.getSaldo();

            //conversione saldo ad entity

            log.info("Transformazione response in entity");

            SaldoEntity saldoEntity = saldoToEntity(saldo);

            log.info("Inserimento a DB...");

            serviceSaldo.save(saldoEntity);

            log.info("...inserimento completato con successo");

            return saldo;

        }catch(HttpStatusCodeException e) {
            e.printStackTrace();
            return null;
        }catch(RestClientException e){
            e.printStackTrace();
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value="/transazioni/{accountId}", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Transazione> getTransactions(@PathVariable("accountId") Long accountId){

        try {
            String uriSandBox = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/" + accountId + "/transactions";

            UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uriSandBox)
                    // Add query parameter
                    .queryParam("fromAccountingDate", "2019-01-21")
                    .queryParam("toAccountingDate", "2019-04-03");

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Auth-Schema", "S2S");
            headers.add("apiKey", apiKey);
            HttpEntity<String> entity = new HttpEntity<>("parameters", headers);

            ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET,entity,String.class);

            WrapperTransazione data = null;
            try {

                data = new ObjectMapper()
                        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                        .readValue(response.getBody(), WrapperTransazione.class);

                log.info("Dati ottenuti correttamente");

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            ListaTransazioni listaTransazioni = data.getListaTransazioni();

            log.info("Transformazione response in entity");

            List<TransazioneEntity> transazioneEntities = transazioniToEntity(listaTransazioni.getTransazioni());

            log.info("Inserimento a DB di "+ transazioneEntities.size() +" transazioni...");

            int count = 0;

            for(TransazioneEntity transazione : transazioneEntities){

                count++;

                serviceTransazione.save(transazione);

                log.info("Inserimento transazione numero "+ count);

            }


            log.info("...inserimento completato con successo");


            return listaTransazioni.getTransazioni();

        }catch(HttpStatusCodeException e) {
            e.printStackTrace();
            return null;
        }catch(RestClientException e){
            e.printStackTrace();
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value="/moneytransfer/{accountId}", method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseMoneyTransfer postMoneyTransfer(@RequestBody RequestMoneyTransfer requestMoneyTransfer, @PathVariable("accountId") Long accountId){

        try {
            String uriSandBox = "https://sandbox.platfr.io/api/gbs/banking/v4.0/accounts/" + accountId + "/payments/money-transfers";

            RestTemplate restTemplate = new RestTemplate();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Auth-Schema", "S2S");
            headers.add("X-Time-Zone", "");
            headers.add("apiKey", apiKey);
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

            HttpEntity<RequestMoneyTransfer> entity = new HttpEntity<>(requestMoneyTransfer, headers);

            ResponseEntity<String> response = restTemplate.postForEntity(uriSandBox,entity,String.class);

            WrapperResponseMoneyTransfer data = null;
            try {

                data = new ObjectMapper()
                        .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                        .readValue(response.getBody(), WrapperResponseMoneyTransfer.class);

                log.info("Dati ottenuti correttamente");

            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }

            ResponseMoneyTransfer responseTransfer = data.getResponse();

            //conversione response ad entity

            log.info("Transformazione response in entity");

            ResponseMoneyTransferEntity responseEntity = responseTransferToEntity(responseTransfer);

            log.info("Inserimento a DB...");

            serviceResponseTransfer.save(responseEntity);

            log.info("...inserimento completato con successo");


            return responseTransfer;

        }catch(HttpStatusCodeException e) {
            e.printStackTrace();
            return null;
        }catch(RestClientException e){
            e.printStackTrace();
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }

    public SaldoEntity saldoToEntity(Saldo saldo){

        SaldoEntity entity = new SaldoEntity();

        entity.setAvailableBalance(saldo.getAvailableBalance().doubleValue());
        entity.setBalance(saldo.getBalance().doubleValue());
        entity.setCurrency(saldo.getCurrency());
        entity.setDate(new java.sql.Date(saldo.getDate().getTime()) );

        return entity;
    }

    public List<TransazioneEntity> transazioniToEntity(List<Transazione> transazioni){

        List<TransazioneEntity> entities = new ArrayList<>();
        TipologiaEntity tipologiaEntity = new TipologiaEntity();

        for(Transazione transazione : transazioni){

            TransazioneEntity entity = new TransazioneEntity();

            entity.setAccountingDate(new java.sql.Date(transazione.getAccountingDate().getTime()) );
            entity.setAmount(transazione.getAmount().doubleValue());
            entity.setCurrency(transazione.getCurrency());
            entity.setDescription(transazione.getDescription());
            entity.setOperationId(transazione.getOperationId());
            entity.setTransactionId(transazione.getTransactionId());

            if(null!=transazione.getType()){

                tipologiaEntity.setEnumeration(transazione.getType().getEnumeration());
                tipologiaEntity.setValue(transazione.getType().getValue());

                entity.setType(tipologiaEntity);
            }

            entity.setValueDate(new java.sql.Date(transazione.getValueDate().getTime()));

            entities.add(entity);

        }

        return entities;
    }


    public ResponseMoneyTransferEntity responseTransferToEntity(ResponseMoneyTransfer response){

        ResponseMoneyTransferEntity entity = new ResponseMoneyTransferEntity();
        CreditorEntity creditorEntity = new CreditorEntity();
        AccountEntity creditorAccountEntity = new AccountEntity();
        AccountEntity debtorAccountEntity = new AccountEntity();
        AddressEntity addressEntity = new AddressEntity();
        DebtorEntity debtorEntity = new DebtorEntity();
        AmountEntity amountEntity = new AmountEntity();
        Set<FeeEntity> feesEntity = null;

        if(null!=response.getCreditor()){

            if(null!=response.getCreditor().getAccount()){

                creditorAccountEntity.setAccountCode(response.getCreditor().getAccount().getAccountCode());
                creditorAccountEntity.setBicCode(response.getCreditor().getAccount().getBicCode());

                creditorEntity.setAccount(creditorAccountEntity);
            }

            if(null!=response.getCreditor().getAddress()){

                addressEntity.setAddress(response.getCreditor().getAddress().getAddress());
                addressEntity.setCity(response.getCreditor().getAddress().getCity());
                addressEntity.setCountryCode(response.getCreditor().getAddress().getCountryCode());

                creditorEntity.setAddress(addressEntity);
            }

            creditorEntity.setName(response.getCreditor().getName());

            entity.setCreditor(creditorEntity);
        }

        if(null!=response.getDebtor()){

            if(null!=response.getDebtor().getAccount()){

                debtorAccountEntity.setAccountCode(response.getDebtor().getAccount().getAccountCode());
                debtorAccountEntity.setBicCode(response.getDebtor().getAccount().getBicCode());

                debtorEntity.setAccount(creditorAccountEntity);
            }

            debtorEntity.setName(response.getDebtor().getName());

            entity.setDebtor(debtorEntity);
        }

        if(null!=response.getAmount()){

            amountEntity.setCreditorAmount(response.getAmount().getCreditorAmount());
            amountEntity.setCreditorCurrency(response.getAmount().getCreditorCurrency());
            amountEntity.setCreditorCurrencyDate(
                    new java.sql.Date(response.getAmount().getCreditorCurrencyDate().getTime()));
            amountEntity.setDebtorAmount(response.getAmount().getDebtorAmount());
            amountEntity.setDebtorCurrency(response.getAmount().getDebtorCurrency());
            amountEntity.setExchangeRate(response.getAmount().getExchangeRate());

            entity.setAmount(amountEntity);
        }

        if(null!=response.getFees() && !response.getFees().isEmpty()){

            for(Fee fee : response.getFees()){

                FeeEntity feeEntity = new FeeEntity();

                feeEntity.setAmount(fee.getAmount());
                feeEntity.setCurrency(fee.getCurrency());
                feeEntity.setDescription(fee.getDescription());
                feeEntity.setFeeCode(fee.getFeeCode());

                feesEntity.add(feeEntity);

            }

            entity.setFees(feesEntity);
        }

        entity.setAccountedDatetime(new java.sql.Date(response.getAccountedDatetime().getTime()));
        entity.setCreatedDatetime(new java.sql.Date(response.getCreatedDatetime().getTime()));
        entity.setCreditorValueDate(new java.sql.Date(response.getCreditorValueDate().getTime()));
        entity.setCro(response.getCro());
        entity.setDebtorValueDate(new java.sql.Date(response.getDebtorValueDate().getTime()));
        entity.setDescription(response.getDescription());
        entity.setDirection(response.getDirection());
        entity.setFeeAccountId(response.getFeeAccountId());
        entity.setFeeType(response.getFeeType());
        entity.setHasTaxRelief(response.getHasTaxRelief());
        entity.setInstant(response.getInstant());
        entity.setMoneyTransferId(response.getMoneyTransferId());
        entity.setStatus(response.getStatus());
        entity.setTrn(response.getTrn());
        entity.setUrgent(response.getUrgent());
        entity.setUri(response.getUri());

        return entity;
    }

}
