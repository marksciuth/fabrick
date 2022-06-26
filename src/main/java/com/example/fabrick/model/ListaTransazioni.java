package com.example.fabrick.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ListaTransazioni {

    @JsonProperty("list")
    private List<Transazione> transazioni;

    public List<Transazione> getTransazioni() {
        return transazioni;
    }

    public void setTransazioni(List<Transazione> transazioni) {
        this.transazioni = transazioni;
    }
}