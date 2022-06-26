package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Saldo {

    @JsonProperty("date")
    Date date;

    @JsonProperty("balance")
    Number balance;

    @JsonProperty("availableBalance")
    Number availableBalance;

    @JsonProperty("currency")
    String currency;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Number getBalance() {
        return balance;
    }

    public void setBalance(Number balance) {
        this.balance = balance;
    }

    public Number getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(Number availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
