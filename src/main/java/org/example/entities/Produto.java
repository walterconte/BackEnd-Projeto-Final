package org.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long proId;

    @Column(name = "PRO_NOME")
    private String proNome;

    @Column(name = "PRO_PRECO_CUSTO", precision = 10, scale = 2)
    private Double proPrecoCusto;

    @Column(name = "PRO_PRECO_VENDA", precision = 10, scale = 2)
    private Double proPrecoVenda;

    @Column(name = "PRO_DESCRICAO")
    private String proDescricao;

    @Column(name = "PRO_QUANTIDADE_ESTQUE")
    private int proQuantidadeEstoque;

    @Column(name = "PRO_STATUS")
    private String proStatus;

    @Column(name = "PRO_CATEGORIA")
    private String proCategoria;

    @Column(name = "PRO_CODIGOBARRAS")
    private String proCodigoBarras;

    @Column(name = "PRO_MARCA")
    private String proMarca;

    @Column(name = "PRO_DATACADASTRO")
    private LocalDateTime proDataCadastro;

    @Column(name = "PRO_DATAATUALIZACAO")
    private LocalDateTime proDataAtualizacao;

    public Produto() {
    }

    public Produto(Long proId, String proNome, Double proPrecoCusto, Double proPrecoVenda, String proDescricao, int proQuantidadeEstoque, String proStatus, String proCategoria, String proCodigoBarras, String proMarca, LocalDateTime proDataCadastro, LocalDateTime proDataAtualizacao) {
        this.proId = proId;
        this.proNome = proNome;
        this.proPrecoCusto = proPrecoCusto;
        this.proPrecoVenda = proPrecoVenda;
        this.proDescricao = proDescricao;
        this.proQuantidadeEstoque = proQuantidadeEstoque;
        this.proStatus = proStatus;
        this.proCategoria = proCategoria;
        this.proCodigoBarras = proCodigoBarras;
        this.proMarca = proMarca;
        this.proDataCadastro = proDataCadastro;
        this.proDataAtualizacao = proDataAtualizacao;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public Double getProPrecoCusto() {
        return proPrecoCusto;
    }

    public void setProPrecoCusto(Double proPrecoCusto) {
        this.proPrecoCusto = proPrecoCusto;
    }

    public Double getProPrecoVenda() {
        return proPrecoVenda;
    }

    public void setProPrecoVenda(Double proPrecoVenda) {
        this.proPrecoVenda = proPrecoVenda;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public int getProQuantidadeEstoque() {
        return proQuantidadeEstoque;
    }

    public void setProQuantidadeEstoque(int proQuantidadeEstoque) {
        this.proQuantidadeEstoque = proQuantidadeEstoque;
    }

    public String getProStatus() {
        return proStatus;
    }

    public void setProStatus(String proStatus) {
        this.proStatus = proStatus;
    }

    public String getProCategoria() {
        return proCategoria;
    }

    public void setProCategoria(String proCategoria) {
        this.proCategoria = proCategoria;
    }

    public String getProCodigoBarras() {
        return proCodigoBarras;
    }

    public void setProCodigoBarras(String proCodigoBarras) {
        this.proCodigoBarras = proCodigoBarras;
    }

    public String getProMarca() {
        return proMarca;
    }

    public void setProMarca(String proMarca) {
        this.proMarca = proMarca;
    }

    public LocalDateTime getProDataCadastro() {
        return proDataCadastro;
    }

    public void setProDataCadastro(LocalDateTime proDataCadastro) {
        this.proDataCadastro = proDataCadastro;
    }

    public LocalDateTime getProDataAtualizacao() {
        return proDataAtualizacao;
    }

    public void setProDataAtualizacao(LocalDateTime proDataAtualizacao) {
        this.proDataAtualizacao = proDataAtualizacao;
    }
}