package com.example.fabrick.model.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Table( name = "response_transfer")
public class ResponseMoneyTransferEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "money_transfer_id")
    private String moneyTransferId;

    @Column(length = 45, name = "status")
    private String status;

    @Column(length = 45, name = "direction")
    private String direction;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "response_transfer_creditor",
            joinColumns = @JoinColumn(name = "id_response_transfer", nullable = true, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_creditor", nullable = true, referencedColumnName = "id")
    )
    private CreditorEntity creditor;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "response_transfer_debtor",
            joinColumns = @JoinColumn(name = "id_response_transfer", nullable = true, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_debtor", nullable = true, referencedColumnName = "id")
    )
    private DebtorEntity debtor;

    @Column(length = 45, name = "cro")
    private String cro;

    @Column(length = 45, name = "trn")
    private String trn;

    @Column(length = 45, name = "uri")
    private String uri;

    @Column(length = 45, name = "description")
    private String description;

    @Column(name = "created_datetime")
    private Date createdDatetime;

    @Column(name = "accounted_datetime")
    private Date accountedDatetime;

    @Column(name = "debtor_value_date")
    private Date debtorValueDate;

    @Column(name = "creditor_value_date")
    private Date creditorValueDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "response_transfer_amount",
            joinColumns = @JoinColumn(name = "id_response_transfer", nullable = true, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_amount", nullable = true, referencedColumnName = "id")
    )
    private AmountEntity amount;

    @Column(name = "is_urgent")
    private Boolean isUrgent;

    @Column(name = "is_instant")
    private Boolean isInstant;

    @Column(length = 45, name = "fee_type")
    private String feeType;

    @Column(length = 45, name = "fee_account_id")
    private String feeAccountId;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "response_transfer_fee",
            joinColumns = @JoinColumn(name = "id_response_transfer", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_fee", referencedColumnName = "id")
    )
    private Set<FeeEntity> fees;

    @Column(name = "has_tax_relief")
    private Boolean hasTaxRelief;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public CreditorEntity getCreditor() {
        return creditor;
    }

    public void setCreditor(CreditorEntity creditor) {
        this.creditor = creditor;
    }

    public DebtorEntity getDebtor() {
        return debtor;
    }

    public void setDebtor(DebtorEntity debtor) {
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

    public AmountEntity getAmount() {
        return amount;
    }

    public void setAmount(AmountEntity amount) {
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

    public Set<FeeEntity> getFees() {
        return fees;
    }

    public void setFees(Set<FeeEntity> fees) {
        this.fees = fees;
    }

    public Boolean getHasTaxRelief() {
        return hasTaxRelief;
    }

    public void setHasTaxRelief(Boolean hasTaxRelief) {
        this.hasTaxRelief = hasTaxRelief;
    }
}
