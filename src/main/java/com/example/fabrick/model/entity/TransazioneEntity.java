package com.example.fabrick.model.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table( name = "transazione")
public class TransazioneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "transactionId")
    private String transactionId;

    @Column(length = 45, name = "operationId")
    private String operationId;

    @Column(name = "accountingDate")
    private Date accountingDate;

    @Column(name = "valueDate")
    private Date valueDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "transazione_tipologia",
            joinColumns = @JoinColumn(name = "id_transazione", nullable = true, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_tipologia", nullable = true, referencedColumnName = "id")
    )
    private TipologiaEntity type;

    @Column(name = "amount")
    private Number amount;

    @Column(length = 45, name = "currency")
    private String currency;

    @Column(length = 45, name = "description")
    private String description;


    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public Date getAccountingDate() {
        return accountingDate;
    }

    public void setAccountingDate(Date accountingDate) {
        this.accountingDate = accountingDate;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public TipologiaEntity getType() {
        return type;
    }

    public void setType(TipologiaEntity type) {
        this.type = type;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
