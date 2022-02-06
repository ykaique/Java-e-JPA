package br.com.ygor.jpa.modelo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Movimentacao {

    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipoMovimentacao;
    private LocalDateTime data;
    private BigDecimal valor;
    private String descricao;
    @ManyToOne
    private Conta conta;
    @ManyToMany
    private List<Categoria> categorias;

    @Deprecated
    public Movimentacao() {
    }

    public Movimentacao(TipoMovimentacao tipoMovimentacao, LocalDateTime data, BigDecimal valor, String descricao, Conta conta,
                        List<Categoria> categorias) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.conta = conta;
        this.categorias = categorias;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
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

    public TipoMovimentacao getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(TipoMovimentacao tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
