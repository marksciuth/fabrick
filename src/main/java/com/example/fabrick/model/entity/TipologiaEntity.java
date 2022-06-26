package com.example.fabrick.model.entity;

import javax.persistence.*;

@Entity
@Table( name = "tipologia")
public class TipologiaEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, name = "enumeration")
    private String enumeration;

    @Column(length = 45, name = "value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getEnumeration() {
        return enumeration;
    }

    public void setEnumeration(String enumeration) {
        this.enumeration = enumeration;
    }

}

