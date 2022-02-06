package br.com.ygor.jpa.testes;

import br.com.ygor.jpa.modelo.Conta;
import br.com.ygor.jpa.modelo.Movimentacao;

import javax.persistence.*;
import java.util.List;

public class TesteJPQL {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = em.find(Conta.class, 2L);
        String jpql = "SELECT m FROM Movimentacao m WHERE m.conta = conta order by m.valor desc";

        TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
        List<Movimentacao> result = query.getResultList();
        for (Movimentacao movimentacao :
                result) {
            System.out.println(movimentacao.getDescricao());
            System.out.println(movimentacao.getValor());
        }

    }

}
