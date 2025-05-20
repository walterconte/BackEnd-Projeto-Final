package org.example.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PRO_ID")
    private Long proId;

    @NotBlank(message = "Nome do produto é obrigatório")
    @Size(max = 100, message = "Nome do produto inválido")
    @Column(name = "PRO_NOME", length = 100)
    private String proNome;

    @Column(name = "PRO_PRECO_CUSTO", precision = 10, scale = 2)
    private Double proPrecoCusto;

    @Column(name = "PRO_PRECO_VENDA", precision = 10, scale = 2)
    private Double proPrecoVenda;

    @Size(max = 255, message = "Descrição do produto inválida")
    @Column(name = "PRO_DESCRICAO", length = 255)
    private String proDescricao;

    @Column(name = "PRO_QUANTIDADE_ESTQUE")
    private int proQuantidadeEstoque;

    @NotBlank(message = "Status do produto é obrigatório")
    @Size(max = 20, message = "Status do produto inválido")
    @Column(name = "PRO_STATUS", length = 20)
    private String proStatus;

    @NotBlank(message = "Categoria do produto é obrigatória")
    @Size(max = 50, message = "Categoria do produto inválida")
    @Column(name = "PRO_CATEGORIA", length = 50)
    private String proCategoria;

    @Size(max = 50, message = "Código de barras inválido")
    @Column(name = "PRO_CODIGOBARRAS", length = 50)
    private String proCodigoBarras;

    @Size(max = 50, message = "Marca inválida")
    @Column(name = "PRO_MARCA", length = 50)
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