package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "response_transfer_amount")
public class ResponseTransferAmount {

    @EmbeddedId
    private ResponseTransferAmountId id;

    public ResponseTransferAmountId getId() {
        return id;
    }

    public void setId(ResponseTransferAmountId id) {
        this.id = id;
    }

}
