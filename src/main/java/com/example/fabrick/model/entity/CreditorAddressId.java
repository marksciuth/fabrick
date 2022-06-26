package com.example.fabrick.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CreditorAddressId implements Serializable {

    private static final long serialVersionUID = 6185875438039714050L;

    @Column(nullable = false, length = 11, name="id_creditor")
    private Integer idCreditor;

    @Column(nullable = false, length = 11, name="id_address")
    private Integer idAddress;

    public Integer getIdCreditor() {
        return idCreditor;
    }

    public void setIdCreditor(Integer idCreditor) {
        this.idCreditor = idCreditor;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }
}
