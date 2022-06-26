package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "response_transfer_creditor")
public class ResponseTransferCreditor {

    @EmbeddedId
    private ResponseTransferCreditorId id;

    public ResponseTransferCreditorId getId() {
        return id;
    }

    public void setId(ResponseTransferCreditorId id) {
        this.id = id;
    }

}
