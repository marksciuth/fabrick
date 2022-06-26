package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "response_transfer_debtor")
public class ResponseTransferDebtor {

    @EmbeddedId
    private ResponseTransferDebtorId id;

    public ResponseTransferDebtorId getId() {
        return id;
    }

    public void setId(ResponseTransferDebtorId id) {
        this.id = id;
    }

}
