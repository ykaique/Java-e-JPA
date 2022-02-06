package br.com.ygor.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Conta {

    @Id
    @GeneratedValue
    private Long id;
    private Integer agencia;
    private Integer numero;
    private Double saldo;

    @Deprecated
    public Conta() {
    }

    public Conta(Integer agencia, Integer numero, Double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}
