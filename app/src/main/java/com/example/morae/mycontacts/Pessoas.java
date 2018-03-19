package com.example.morae.mycontacts;

/**
 * @author Lucas de Souza Moraes
 */
public class Pessoas {
    String nome;
    String endereco;
    String referencia;
    String fone;
    String email;

    public Pessoas(String nome, String endereco, String referencia, String fone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.referencia = referencia;
        this.fone = fone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
