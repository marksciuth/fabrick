package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Creditor {

    @JsonProperty("name")
    String name;

    @JsonProperty("account")
    Account account;

    @JsonProperty("address")
    Address address;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
