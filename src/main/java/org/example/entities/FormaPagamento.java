package org.example.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class FormaPagamento  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FPG_ID")
    private Long fpgId;

    @NotBlank(message = "Descrição do pagamento é obrigatória")
    @Size(max = 100, message = "Descrição do pagamento inválida")
    @Column(name = "FPG_DESCRICAO", length = 100)
    private String fpgDescricao;

    @NotBlank(message = "Tipo de pagamento é obrigatório")
    @Size(max = 50, message = "Tipo de pagamento inválido")
    @Column(name = "FPG_TIPO", length = 50)
    private String fpgTipo;

    @Column(name = "FPG_TAXA")
    private double fpgTaxa;

    @NotBlank(message = "Parcelamento do pagamento é obrigatório")
    @Size(max = 50, message = "Parcelamento do pagamento inválido")
    @Column(name = "FPG_PARCELAMENTO", length = 50)
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