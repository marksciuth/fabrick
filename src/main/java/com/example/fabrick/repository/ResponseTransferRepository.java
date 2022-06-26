package com.example.fabrick.repository;

import com.example.fabrick.model.entity.ResponseMoneyTransferEntity;
import org.springframework.data.repository.CrudRepository;

public interface ResponseTransferRepository extends CrudRepository<ResponseMoneyTransferEntity, Integer> {

    Long countById(Integer id);

}
