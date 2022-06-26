package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "creditor_address")
public class CreditorAddress {

    @EmbeddedId
    private CreditorAddressId id;

    public CreditorAddressId getId() {
        return id;
    }

    public void setId(CreditorAddressId id) {
        this.id = id;
    }

}
