package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class FormaPagamento  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FPG_ID")
    private Long fpgId;

    @Column(name = "FPG_DESCRICAO")
    private String fpgDescricao;

    @Column(name = "FPG_TIPO")
    private String fpgTipo;

    @Column(name = "FPG_TAXA")
    private double fpgTaxa;

    @Column(name = "FPG_PARCELAMENTO")
    private String fpgParcelamento;

    public FormaPagamento() {
    }

    public FormaPagamento(Long fpgId, String fpgDescricao, String fpgTipo, double fpgTaxa, String fpgParcelamento) {
        this.fpgId = fpgId;
        this.fpgDescricao = fpgDescricao;
        this.fpgTipo = fpgTipo;
        this.fpgTaxa = fpgTaxa;
        this.fpgParcelamento = fpgParcelamento;
    }

    public Long getFpgId() {
        return fpgId;
    }

    public void setFpgId(Long fpgId) {
        this.fpgId = fpgId;
    }

    public String getFpgDescricao() {
        return fpgDescricao;
    }

    public void setFpgDescricao(String fpgDescricao) {
        this.fpgDescricao = fpgDescricao;
    }

    public String getFpgTipo() {
        return fpgTipo;
    }

    public void setFpgTipo(String fpgTipo) {
        this.fpgTipo = fpgTipo;
    }

    public double getFpgTaxa() {
        return fpgTaxa;
    }

    public void setFpgTaxa(double fpgTaxa) {
        this.fpgTaxa = fpgTaxa;
    }

    public String getFpgParcelamento() {
        return fpgParcelamento;
    }

    public void setFpgParcelamento(String fpgParcelamento) {
        this.fpgParcelamento = fpgParcelamento;
    }
}