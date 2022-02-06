package br.com.ygor.jpa.modelo;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private String profissao;
    private String endereco;
    @JoinColumn(unique = true)
    @OneToOne
    private Conta conta;

    @Deprecated
    public Cliente() {
    }

    public Cliente(String nome, String endereco, String profissao, Conta conta) {
        this.nome = nome;
        this.endereco = endereco;
        this.profissao = profissao;
        this.conta=conta;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
