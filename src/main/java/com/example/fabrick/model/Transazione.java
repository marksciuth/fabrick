package com.example.fabrick.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Transazione {

    @JsonProperty("transactionId")
    String transactionId;

    @JsonProperty("operationId")
    String operationId;

    @JsonProperty("accountingDate")
    Date accountingDate;

    @JsonProperty("valueDate")
    Date valueDate;

    @JsonProperty("type")
    Tipologia type;

    @JsonProperty("amount")
    Number amount;

    @JsonProperty("currency")
    String currency;

    @JsonProperty("description")
    String description;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public Date getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(Date accountingDate) {
        this.accountingDate = accountingDate;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public Tipologia getType() {
        return type;
    }

    public void setType(Tipologia type) {
        this.type = type;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
