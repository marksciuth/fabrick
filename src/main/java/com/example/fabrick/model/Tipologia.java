package com.example.fabrick.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Enumeration;


public class Tipologia implements Enumeration {

    @JsonProperty("enumeration")
    private String enumeration;

    @JsonProperty("value")
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

    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public Object nextElement() {
        return null;
    }
}

