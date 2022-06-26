package com.example.fabrick.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxRelief {

    @JsonProperty(value = "taxReliefId")
    String taxReliefId;

    @JsonProperty(value = "isCondoUpgrade", required = true)
    Boolean isCondoUpgrade;

    @JsonProperty(value = "creditorFiscalCode", required = true)
    String creditorFiscalCode;

    @JsonProperty(value = "beneficiaryType", required = true)
    String beneficiaryType;

    @JsonProperty(value = "naturalPersonBeneficiary")
    NaturalPersonBeneficiary naturalPersonBeneficiary;

    @JsonProperty(value = "legalPersonBeneficiary")
    LegalPersonBeneficiary legalPersonBeneficiary;

    public String getTaxReliefId() {
        return taxReliefId;
    }

    public void setTaxReliefId(String taxReliefId) {
        this.taxReliefId = taxReliefId;
    }

    public Boolean getCondoUpgrade() {
        return isCondoUpgrade;
    }

    public void setCondoUpgrade(Boolean condoUpgrade) {
        isCondoUpgrade = condoUpgrade;
    }

    public String getCreditorFiscalCode() {
        return creditorFiscalCode;
    }

    public void setCreditorFiscalCode(String creditorFiscalCode) {
        this.creditorFiscalCode = creditorFiscalCode;
    }

    public String getBeneficiaryType() {
        return beneficiaryType;
    }

    public void setBeneficiaryType(String beneficiaryType) {
        this.beneficiaryType = beneficiaryType;
    }

    public NaturalPersonBeneficiary getNaturalPersonBeneficiary() {
        return naturalPersonBeneficiary;
    }

    public void setNaturalPersonBeneficiary(NaturalPersonBeneficiary naturalPersonBeneficiary) {
        this.naturalPersonBeneficiary = naturalPersonBeneficiary;
    }

    public LegalPersonBeneficiary getLegalPersonBeneficiary() {
        return legalPersonBeneficiary;
    }

    public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
        this.legalPersonBeneficiary = legalPersonBeneficiary;
    }
}
