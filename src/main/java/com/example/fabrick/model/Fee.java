package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Fee {


    @JsonProperty("feeCode")
    String feeCode;

    @JsonProperty("description")
    String description;

    @JsonProperty("amount")
    Number amount;

    @JsonProperty("currency")
    String currency;

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Number getAmount() {
        return amount;
    }

    public void setAmount(Number amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
