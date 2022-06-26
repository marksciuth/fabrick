package com.example.fabrick.model.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table( name = "amount")
public class AmountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "debtorAmount")
    private Number debtorAmount;

    @Column(length = 45, name = "debtorCurrency")
    private String debtorCurrency;

    @Column(name = "creditorAmount")
    private Number creditorAmount;

    @Column(length = 45, name = "creditorCurrency")
    private String creditorCurrency;

    @Column(name = "creditorCurrencyDate")
    private Date creditorCurrencyDate;

    @Column(name = "exchangeRate")
    private Number exchangeRate;

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
