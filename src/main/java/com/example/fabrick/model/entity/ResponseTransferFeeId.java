package com.example.fabrick.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ResponseTransferFeeId implements Serializable {

    private static final long serialVersionUID = 6185875438039714050L;

    @Column(nullable = false, length = 11, name="id_response_transfer")
    private Integer idResponseTransfer;

    @Column(nullable = false, length = 11, name="id_fee")
    private Integer idFee;

    public Integer getIdResponseTransfer() {
        return idResponseTransfer;
    }

    public void setIdResponseTransfer(Integer idResponseTransfer) {
        this.idResponseTransfer = idResponseTransfer;
    }

    public Integer getIdFee() {
        return idFee;
    }

    public void setIdFee(Integer idFee) {
        this.idFee = idFee;
    }
}
