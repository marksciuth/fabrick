package com.example.fabrick.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class RequestMoneyTransfer {

    @JsonProperty(value = "creditor", required = true)
    Creditor creditor;

    @JsonProperty("executionDate")
    @JsonFormat(pattern="yyyy-MM-dd")
    LocalDate executionDate;

    @JsonProperty("uri")
    String uri;

    @JsonProperty(value = "description", required = true)
    String description;

    @JsonProperty(value = "amount", required = true)
    Number amount;

    @JsonProperty(value = "currency", required = true)
    String currency;

    @JsonProperty("isUrgent")
    Boolean isUrgent;

    @JsonProperty("isInstant")
    Boolean isInstant;

    @JsonProperty("feeType")
    String feeType;

    @JsonProperty(value = "feeAccountId")
    String feeAccountId;

    @JsonProperty(value = "taxRelief")
    TaxRelief taxRelief;

    public Creditor getCreditor() {
        return creditor;
    }

    public void setCreditor(Creditor creditor) {
        this.creditor = creditor;
    }

    public LocalDate getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(LocalDate executionDate) {
        this.executionDate = executionDate;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
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

    public Boolean getUrgent() {
        return isUrgent;
    }

    public void setUrgent(Boolean urgent) {
        isUrgent = urgent;
    }

    public Boolean getInstant() {
        return isInstant;
    }

    public void setInstant(Boolean instant) {
        isInstant = instant;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFeeAccountId() {
        return feeAccountId;
    }

    public void setFeeAccountId(String feeAccountId) {
        this.feeAccountId = feeAccountId;
    }

    public TaxRelief getTaxRelief() {
        return taxRelief;
    }

    public void setTaxRelief(TaxRelief taxRelief) {
        this.taxRelief = taxRelief;
    }
}
