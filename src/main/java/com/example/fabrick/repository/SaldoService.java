package com.example.fabrick.repository;

import com.example.fabrick.exception.ElementoNonTrovatoException;
import com.example.fabrick.model.entity.SaldoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaldoService {

    @Autowired private SaldoRepository repo;

    public List<SaldoEntity> listAll(){
        return (List<SaldoEntity>) repo.findAll();
    }

    public void save(SaldoEntity saldo) {
        repo.save(saldo);
    }

    public SaldoEntity get(Integer id) throws ElementoNonTrovatoException {
        Optional<SaldoEntity> result =  repo.findById(id);

        if(result.isPresent()){
            return result.get();
        }

        throw new ElementoNonTrovatoException(" Non trovato saldo con id" + id);
    }

    public void delete(Integer id) throws ElementoNonTrovatoException {
        Long count = repo.countById(id);

        if (count == null || count == 0){
            throw new ElementoNonTrovatoException(" Non trovato saldo con id" + id);

        }
        repo.deleteById(id);
    }
}
