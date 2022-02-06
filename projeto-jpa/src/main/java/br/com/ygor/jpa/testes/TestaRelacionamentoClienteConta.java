package br.com.ygor.jpa.testes;

import br.com.ygor.jpa.modelo.Cliente;
import br.com.ygor.jpa.modelo.Conta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaRelacionamentoClienteConta {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Cliente cliente = new Cliente("Ygor", "Jose manoel Camisa nova", "Dev", em.find(Conta.class, 2L));

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();
    }

}
