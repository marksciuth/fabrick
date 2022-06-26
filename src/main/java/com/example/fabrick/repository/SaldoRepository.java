package com.example.fabrick.repository;

import com.example.fabrick.model.entity.SaldoEntity;
import org.springframework.data.repository.CrudRepository;

public interface SaldoRepository extends CrudRepository<SaldoEntity, Integer> {

    Long countById(Integer id);

}
