package com.example.fabrick.model.entity;


import javax.persistence.*;

@Entity
@Table( name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "accountCode")
    private String accountCode;

    @Column(length = 45, name = "bicCode")
    private String bicCode;

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getBicCode() {
        return bicCode;
    }

    public void setBicCode(String bicCode) {
        this.bicCode = bicCode;
    }
}
