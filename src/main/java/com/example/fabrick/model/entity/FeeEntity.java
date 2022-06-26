package com.example.fabrick.model.entity;


import javax.persistence.*;

@Entity
@Table( name = "fee")
public class FeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "feeCode")
    private String feeCode;

    @Column(length = 45, name = "description")
    private String description;

    @Column(name = "amount")
    private Number amount;

    @Column(length = 45, name = "currency")
    private String currency;

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
