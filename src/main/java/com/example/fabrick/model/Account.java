package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {

    @JsonProperty("accountCode")
    String accountCode;

    @JsonProperty("bicCode")
    String bicCode;

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
