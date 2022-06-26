package com.example.fabrick.model.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TransazioneTipologiaId implements Serializable {

    private static final long serialVersionUID = 6185875438039714050L;

    @Column(nullable = false, length = 11, name="id_transazione")
    private Integer idTransazione;

    @Column(nullable = false, length = 11, name="id_tipologia")
    private Integer idTipologia;

    public Integer getIdTransazione() {
        return idTransazione;
    }

    public void setIdTransazione(Integer idTransazione) {
        this.idTransazione = idTransazione;
    }

    public Integer getIdTipologia() {
        return idTipologia;
    }

    public void setIdTipologia(Integer idTipologia) {
        this.idTipologia = idTipologia;
    }
}
