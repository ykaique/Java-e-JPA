package br.com.ygor.jpa.testes;

import br.com.ygor.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlteraSaldoYgor {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Conta conta = em.find(Conta.class, 1L);

        em.getTransaction().begin();
        conta.setSaldo(50.0);
        em.getTransaction().commit();

    }

}
