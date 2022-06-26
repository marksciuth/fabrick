package com.example.fabrick.model.entity;


import javax.persistence.*;

@Entity
@Table( name = "transazione")
public class CreditorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "name")
    private String name;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "creditor_account",
            joinColumns = @JoinColumn(name = "id_creditor", nullable = true, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_account", nullable = true, referencedColumnName = "id")
    )
    private AccountEntity account;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinTable(
            name = "creditor_address",
            joinColumns = @JoinColumn(name = "id_creditor", nullable = true, referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_address", nullable = true, referencedColumnName = "id")
    )
    private AddressEntity address;

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

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
