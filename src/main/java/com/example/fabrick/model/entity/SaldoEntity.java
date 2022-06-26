package com.example.fabrick.model.entity;


import javax.persistence.*;
import java.sql.Date;

@Entity
@Table( name = "saldo")
public class SaldoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "date")
    private Date date;

    @Column(name = "balance")
    private Number balance;

    @Column(name = "available_balance")
    private Number availableBalance;

    @Column(length = 45, name = "currency")
    private String currency;

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
