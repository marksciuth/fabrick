package com.example.fabrick.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table( name = "debtor_account")
public class DebtorAccount {

    @EmbeddedId
    private DebtorAccountId id;

    public DebtorAccountId getId() {
        return id;
    }

    public void setId(DebtorAccountId id) {
        this.id = id;
    }

}
