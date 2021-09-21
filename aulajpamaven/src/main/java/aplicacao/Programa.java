package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();  // conexão com banco de dados
		
		Pessoa p = em.find(Pessoa.class, 2); // pesquisa o objeto pelo id, depois de coverte esse dado para o objeto
		
		em.getTransaction().begin(); // transação para poder excluir depois de puxar o objeto no banco de dados
		
		em.remove(p);  // para apagar um objeto do banco de dados 
		
		em.getTransaction().commit(); // depois de removido 
		
		
	
		System.out.println("pronto");
		
		em.close();
		emf.close();
		
		
	}

}
