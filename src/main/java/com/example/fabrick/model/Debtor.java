package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Debtor {

    @JsonProperty("name")
    String name;

    @JsonProperty("account")
    Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
