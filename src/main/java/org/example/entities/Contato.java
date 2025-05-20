package org.example.entities;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
public class Contato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CON_ID")
    private Long conId;

    @Column(name = "CON_CELULAR", length = 14)
    private String conCelular;

    @NotBlank(message = "Contato de telefone comercial é obrigatório")
    @Size(message = "Contato comercial inválido")
    @Column(name = "CON_TELEFONE_COMERCIAL", length = 55)
    private String conTelefoneComercial;


    @NotBlank(message = "Email é obrigatório")
    @Email(message = "Email inválido")
    @Size(max = 100,message = "Email deve ter no máximo 100 caracteres")
    @Column(name = "CON_EMAIL", nullable = false, length = 55)
    private String conEmail;


    public Contato() {
    }

    public Contato(Long conId, String conCelular, String conTelefoneComercial, String conEmail) {
        this.conId = conId;
        this.conCelular = conCelular;
        this.conTelefoneComercial = conTelefoneComercial;
        this.conEmail = conEmail;
    }

    public Long getConId() {
        return conId;
    }

    public void setConId(Long conId) {
        this.conId = conId;
    }

    public String getConCelular() {
        return conCelular;
    }

    public void setConCelular(String conCelular) {
        this.conCelular = conCelular;
    }

    public String getConTelefoneComercial() {
        return conTelefoneComercial;
    }

    public void setConTelefoneComercial(String conTelefoneComercial) {
        this.conTelefoneComercial = conTelefoneComercial;
    }

    public String getConEmail() {
        return conEmail;
    }

    public void setConEmail(String conEmail) {
        this.conEmail = conEmail;
    }
}
