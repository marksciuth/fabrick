package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "transazione_tipologia")
public class TransazioneTipologia {

    @EmbeddedId
    private TransazioneTipologiaId id;

    public TransazioneTipologiaId getId() {
        return id;
    }

    public void setId(TransazioneTipologiaId id) {
        this.id = id;
    }

}
