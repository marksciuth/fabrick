package com.example.fabrick.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ResponseTransferCreditorId implements Serializable {

    private static final long serialVersionUID = 6185875438039714050L;

    @Column(nullable = false, length = 11, name="id_response_transfer")
    private Integer idResponseTransfer;

    @Column(nullable = false, length = 11, name="id_creditor")
    private Integer idCreditor;

    public Integer getIdResponseTransfer() {
        return idResponseTransfer;
    }

    public void setIdResponseTransfer(Integer idResponseTransfer) {
        this.idResponseTransfer = idResponseTransfer;
    }

    public Integer getIdCreditor() {
        return idCreditor;
    }

    public void setIdCreditor(Integer idCreditor) {
        this.idCreditor = idCreditor;
    }

}
