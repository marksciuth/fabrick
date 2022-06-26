package com.example.fabrick.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DebtorAccountId implements Serializable {

    private static final long serialVersionUID = 6185875438039714050L;

    @Column(nullable = false, length = 11, name="id_debtor")
    private Integer idDebtor;

    @Column(nullable = false, length = 11, name="id_account")
    private Integer idAccount;

    public Integer getIdDebtor() {
        return idDebtor;
    }

    public void setIdDebtor(Integer idDebtor) {
        this.idDebtor = idDebtor;
    }

    public Integer getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Integer idAccount) {
        this.idAccount = idAccount;
    }
}
