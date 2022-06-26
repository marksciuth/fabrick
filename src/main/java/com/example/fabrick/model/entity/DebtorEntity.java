package com.example.fabrick.model.entity;


import javax.persistence.*;

@Entity
@Table( name = "debtor")
public class DebtorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "name")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "debtor_account",
            joinColumns = @JoinColumn(name = "id_debtor", nullable = true, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_account", nullable = true, referencedColumnName = "id")
    )
    private AccountEntity account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccountEntity getAccount() {
        return account;
    }

    public void setAccount(AccountEntity account) {
        this.account = account;
    }

}
