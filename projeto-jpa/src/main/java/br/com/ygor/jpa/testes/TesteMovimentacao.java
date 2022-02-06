package br.com.ygor.jpa.testes;

import br.com.ygor.jpa.modelo.Conta;
import br.com.ygor.jpa.modelo.Movimentacao;
import br.com.ygor.jpa.modelo.TipoMovimentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TesteMovimentacao {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();


        Movimentacao movimentacao = new Movimentacao(TipoMovimentacao.ENTRADA, LocalDateTime.now(), new BigDecimal(200.0),
                "Festa", em.find(Conta.class, 1L), null);

        em.getTransaction().begin();
        em.persist(movimentacao);
        em.getTransaction().commit();
        em.close();

    }

}
