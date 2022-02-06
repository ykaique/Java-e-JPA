package br.com.ygor.jpa.testes;

import br.com.ygor.jpa.modelo.Categoria;
import br.com.ygor.jpa.modelo.Conta;
import br.com.ygor.jpa.modelo.Movimentacao;
import br.com.ygor.jpa.modelo.TipoMovimentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestaRelacionamentoMovimentacaoCategoria {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();


        Categoria categoria = new Categoria("Viagem");
        Categoria categoria1 = new Categoria("Negocio");

        Movimentacao movimentacao = new Movimentacao(TipoMovimentacao.SAIDA, LocalDateTime.now(), new BigDecimal(200.0), "Indo a SP",
                em.find(Conta.class, 3L), Arrays.asList(categoria, categoria1));

        Movimentacao movimentacao1 = new Movimentacao(TipoMovimentacao.SAIDA, LocalDateTime.now(), new BigDecimal(500.0), "Indo a RJ",
                em.find(Conta.class, 1L), Arrays.asList(categoria, categoria1));

        em.getTransaction().begin();
        em.persist(categoria);
        em.persist(categoria1);
        em.persist(movimentacao);
        em.persist(movimentacao1);
        em.getTransaction().commit();
        em.close();
    }

}
