package br.com.ygor.jpa.testes;

import br.com.ygor.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CriarConta {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = new Conta(1234, 4321, 500.0);

        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();

    }

}
