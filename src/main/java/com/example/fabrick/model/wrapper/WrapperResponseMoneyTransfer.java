package com.example.fabrick.model.wrapper;

import com.example.fabrick.model.ResponseMoneyTransfer;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WrapperResponseMoneyTransfer {

    @JsonProperty("payload")
    private ResponseMoneyTransfer response;

    public ResponseMoneyTransfer getResponse() {
        return response;
    }

    public void setResponse(ResponseMoneyTransfer response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "Wrapper{" +
                "payload=" + response +
                '}';
    }
}