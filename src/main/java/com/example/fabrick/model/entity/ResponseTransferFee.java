package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "response_transfer_fee")
public class ResponseTransferFee {

    @EmbeddedId
    private ResponseTransferFeeId id;

    public ResponseTransferFeeId getId() {
        return id;
    }

    public void setId(ResponseTransferFeeId id) {
        this.id = id;
    }

}
