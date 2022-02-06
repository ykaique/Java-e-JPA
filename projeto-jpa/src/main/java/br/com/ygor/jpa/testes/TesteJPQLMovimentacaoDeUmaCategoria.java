package br.com.ygor.jpa.testes;

import br.com.ygor.jpa.modelo.Categoria;
import br.com.ygor.jpa.modelo.Conta;
import br.com.ygor.jpa.modelo.Movimentacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class TesteJPQLMovimentacaoDeUmaCategoria {

    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
        EntityManager em = emf.createEntityManager();

        Categoria categoria = em.find(Categoria.class, 9L);
        String jpql = "SELECT m FROM Movimentacao m JOIN m.categorias c WHERE c = :pCategoria";

        TypedQuery<Movimentacao> query = em.createQuery(jpql, Movimentacao.class);
        query.setParameter("pCategoria", categoria);
        List<Movimentacao> result = query.getResultList();
        for (Movimentacao movimentacao :
                result) {
            System.out.println(movimentacao.getDescricao());
            System.out.println(movimentacao.getValor());
            System.out.println(movimentacao.getCategorias());
        }


    }

}
