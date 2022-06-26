package com.example.fabrick.model.wrapper;

import com.example.fabrick.model.ListaTransazioni;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WrapperTransazione {

    @JsonProperty("payload")
    private ListaTransazioni listaTransazioni;

    public ListaTransazioni getListaTransazioni() {
        return listaTransazioni;
    }

    public void setListaTransazioni(ListaTransazioni listaTransazioni) {
        this.listaTransazioni = listaTransazioni;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "payload=" + listaTransazioni +
                '}';
    }
}