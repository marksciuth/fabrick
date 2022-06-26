package com.example.fabrick.model.wrapper;

import com.example.fabrick.model.Saldo;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WrapperSaldo {

    @JsonProperty("payload")
    private Saldo saldo;

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "payload=" + saldo +
                '}';
    }
}