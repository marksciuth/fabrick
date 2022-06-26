package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "creditor_account")
public class CreditorAccount {

    @EmbeddedId
    private CreditorAccountId id;

    public CreditorAccountId getId() {
        return id;
    }

    public void setId(CreditorAccountId id) {
        this.id = id;
    }

}
