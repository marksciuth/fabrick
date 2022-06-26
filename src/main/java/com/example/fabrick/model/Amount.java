package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Amount {

    @JsonProperty("debtorAmount")
    Number debtorAmount;

    @JsonProperty("debtorCurrency")
    String debtorCurrency;

    @JsonProperty("creditorAmount")
    Number creditorAmount;

    @JsonProperty("creditorCurrency")
    String creditorCurrency;

    @JsonProperty("creditorCurrencyDate")
    Date creditorCurrencyDate;

    @JsonProperty("exchangeRate")
    Number exchangeRate;

    public Number getDebtorAmount() {
        return debtorAmount;
    }

    public void setDebtorAmount(Number debtorAmount) {
        this.debtorAmount = debtorAmount;
    }

    public String getDebtorCurrency() {
        return debtorCurrency;
    }

    public void setDebtorCurrency(String debtorCurrency) {
        this.debtorCurrency = debtorCurrency;
    }

    public Number getCreditorAmount() {
        return creditorAmount;
    }

    public void setCreditorAmount(Number creditorAmount) {
        this.creditorAmount = creditorAmount;
    }

    public String getCreditorCurrency() {
        return creditorCurrency;
    }

    public void setCreditorCurrency(String creditorCurrency) {
        this.creditorCurrency = creditorCurrency;
    }

    public Date getCreditorCurrencyDate() {
        return creditorCurrencyDate;
    }

    public void setCreditorCurrencyDate(Date creditorCurrencyDate) {
        this.creditorCurrencyDate = creditorCurrencyDate;
    }

    public Number getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Number exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
}
