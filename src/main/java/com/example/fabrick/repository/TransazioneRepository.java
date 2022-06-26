package com.example.fabrick.repository;

import com.example.fabrick.model.entity.TransazioneEntity;
import org.springframework.data.repository.CrudRepository;

public interface TransazioneRepository extends CrudRepository<TransazioneEntity, Integer> {

    Long countById(Integer id);

}
