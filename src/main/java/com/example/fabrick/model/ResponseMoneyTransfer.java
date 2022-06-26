package com.example.fabrick.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class ResponseMoneyTransfer {

    @JsonProperty("moneyTransferId")
    String moneyTransferId;

    @JsonProperty("status")
    String status;

    @JsonProperty("direction")
    String direction;

    @JsonProperty("creditor")
    Creditor creditor;

    @JsonProperty("debtor")
    Debtor debtor;

    @JsonProperty("cro")
    String cro;

    @JsonProperty("trn")
    String trn;

    @JsonProperty("uri")
    String uri;

    @JsonProperty(value = "description")
    String description;

    @JsonProperty("createdDatetime")
    Date createdDatetime;             //to datetime

    @JsonProperty("accountedDatetime")
    Date accountedDatetime;             //to datetime

    @JsonProperty("debtorValueDate")
    Date debtorValueDate;

    @JsonProperty("creditorValueDate")
    Date creditorValueDate;

    @JsonProperty(value = "amount")
    Amount amount;

    @JsonProperty("isUrgent")
    Boolean isUrgent;

    @JsonProperty("isInstant")
    Boolean isInstant;

    @JsonProperty("feeType")
    String feeType;

    @JsonProperty(value = "feeAccountId")
    String feeAccountId;

    @JsonProperty(value = "fees")
    List<Fee> fees;

    @JsonProperty(value = "hasTaxRelief")
    Boolean hasTaxRelief;

    public String getMoneyTransferId() {
        return moneyTransferId;
    }

    public void setMoneyTransferId(String moneyTransferId) {
        this.moneyTransferId = moneyTransferId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Creditor getCreditor() {
        return creditor;
    }

    public void setCreditor(Creditor creditor) {
        this.creditor = creditor;
    }

    public Debtor getDebtor() {
        return debtor;
    }

    public void setDebtor(Debtor debtor) {
        this.debtor = debtor;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }

    public String getTrn() {
        return trn;
    }

    public void setTrn(String trn) {
        this.trn = trn;
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

    public Date getCreatedDatetime() {
        return createdDatetime;
    }

    public void setCreatedDatetime(Date createdDatetime) {
        this.createdDatetime = createdDatetime;
    }

    public Date getAccountedDatetime() {
        return accountedDatetime;
    }

    public void setAccountedDatetime(Date accountedDatetime) {
        this.accountedDatetime = accountedDatetime;
    }

    public Date getDebtorValueDate() {
        return debtorValueDate;
    }

    public void setDebtorValueDate(Date debtorValueDate) {
        this.debtorValueDate = debtorValueDate;
    }

    public Date getCreditorValueDate() {
        return creditorValueDate;
    }

    public void setCreditorValueDate(Date creditorValueDate) {
        this.creditorValueDate = creditorValueDate;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
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

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public Boolean getHasTaxRelief() {
        return hasTaxRelief;
    }

    public void setHasTaxRelief(Boolean hasTaxRelief) {
        this.hasTaxRelief = hasTaxRelief;
    }
}
