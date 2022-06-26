package com.example.fabrick.repository;

import com.example.fabrick.exception.ElementoNonTrovatoException;
import com.example.fabrick.model.entity.ResponseMoneyTransferEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponseTransferService {

    @Autowired private ResponseTransferRepository repo;

    public List<ResponseMoneyTransferEntity> listAll(){
        return (List<ResponseMoneyTransferEntity>) repo.findAll();
    }

    public void save(ResponseMoneyTransferEntity response) {
        repo.save(response);
    }

    public ResponseMoneyTransferEntity get(Integer id) throws ElementoNonTrovatoException {
        Optional<ResponseMoneyTransferEntity> result =  repo.findById(id);

        if(result.isPresent()){
            return result.get();
        }

        throw new ElementoNonTrovatoException(" Non trovata response con id" + id);
    }

    public void delete(Integer id) throws ElementoNonTrovatoException {
        Long count = repo.countById(id);

        if (count == null || count == 0){
            throw new ElementoNonTrovatoException(" Non trovata response con id" + id);

        }
        repo.deleteById(id);
    }
}
