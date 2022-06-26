package com.example.fabrick.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CreditorAccountId implements Serializable {

    private static final long serialVersionUID = 6185875438039714050L;

    @Column(nullable = false, length = 11, name="id_creditor")
    private Integer idCreditor;

    @Column(nullable = false, length = 11, name="id_account")
    private Integer idAccount;

    public Integer getIdCreditor() {
        return idCreditor;
    }

    public void setIdCreditor(Integer idCreditor) {
        this.idCreditor = idCreditor;
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }
}
