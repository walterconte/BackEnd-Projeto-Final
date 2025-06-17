package org.example.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "END_ID")
    private Long endId;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "END_CLI_ID")
    private Cliente endCliente;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "END_FOR_ID")
    private Fornecedor endFornecedor;


    @NotBlank(message = "Endereço de rua é obrigatório")
    @Size(max = 100, message = "Endereço de rua inválido")
    @Column(name = "END_RUA", length = 100)
    private String endRua;

    @NotBlank(message = "Número do endereço é obrigatório")
    @Size(max = 20, message = "Número do endereço inválido")
    @Column(name = "END_NUMERO", length = 20)
    private String endNumero;

    @NotBlank(message = "Cidade é obrigatória")
    @Size(max = 50, message = "Cidade inválida")
    @Column(name = "END_CIDADE", length = 50)
    private String endCidade;

    @NotBlank(message = "CEP é obrigatório")
    @Size(min = 8, max = 8, message = "CEP deve ter 8 caracteres")
    @Column(name = "END_CEP", length = 8)
    private String endCep;

    @NotBlank(message = "Estado é obrigatório")
    @Size(min = 2, max = 2, message = "Estado deve ter 2 caracteres")
    @Column(name = "END_ESTADO", length = 2)
    private String endEstado;



    public Endereco() {
    }

    public Endereco(Long endId,Cliente endCliente, String endRua, String endNumero, String endCidade, String endCep, String endEstado) {
        this.endId = endId;
        this.endCliente = endCliente;
        this.endRua = endRua;
        this.endNumero = endNumero;
        this.endCidade = endCidade;
        this.endCep = endCep;
        this.endEstado = endEstado;
    }

    public Endereco(Long endId,Fornecedor endFornecedor, String endRua, String endNumero, String endCidade, String endCep, String endEstado) {
        this.endId = endId;
        this.endFornecedor = endFornecedor;
        this.endRua = endRua;
        this.endNumero = endNumero;
        this.endCidade = endCidade;
        this.endCep = endCep;
        this.endEstado = endEstado;
    }


    public Long getEndId() {
        return endId;
    }

    public void setEndId(Long endId) {
        this.endId = endId;
    }

    public Cliente getEndCliente() {
        return endCliente;
    }

    public void setEndCliente(Cliente endCliente) {
        this.endCliente = endCliente;
    }

    public Fornecedor getEndFornecedor() {
        return endFornecedor;
    }

    public void setEndFornecedor(Fornecedor endFornecedor) {
        this.endFornecedor = endFornecedor;
    }

    public String getEndRua() {
        return endRua;
    }

    public void setEndRua(String endRua) {
        this.endRua = endRua;
    }

    public String getEndNumero() {
        return endNumero;
    }

    public void setEndNumero(String endNumero) {
        this.endNumero = endNumero;
    }

    public String getEndCidade() {
        return endCidade;
    }

    public void setEndCidade(String endCidade) {
        this.endCidade = endCidade;
    }

    public String getEndCep() {
        return endCep;
    }

    public void setEndCep(String endCep) {
        this.endCep = endCep;
    }

    public String getEndEstado() {
        return endEstado;
    }

    public void setEndEstado(String endEstado) {
        this.endEstado = endEstado;
    }
}