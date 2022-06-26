package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class LegalPersonBeneficiary {

    @JsonProperty(value = "fiscalCode", required = true)
    String fiscalCode;

    @JsonProperty("legalRepresentativeFiscalCode")
    String legalRepresentativeFiscalCode;

    public String getFiscalCode() {
        return fiscalCode;
    }

    public void setFiscalCode(String fiscalCode) {
        this.fiscalCode = fiscalCode;
    }

    public String getLegalRepresentativeFiscalCode() {
        return legalRepresentativeFiscalCode;
    }

    public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
        this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
    }
}
