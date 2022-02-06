package br.com.ygor.jpa.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;
    private String descricao;

    @Deprecated
    public Categoria() {
    }

    public Categoria(String descricao) {
        this.descricao = descricao;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}
