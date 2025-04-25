package Aplicacao;

import Dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // INSTANCIANDO O ENTITY															// MANEGER FACTORY
		EntityManager em = emf.createEntityManager(); // INSTANCIANDO O ENTITY MANAGER, RESPONSAVEL PELAS OPERAÇÕES DE
														// PERSISTENCIA

		em.getTransaction().begin(); // INICIA UMA TRANSAÇÃO

		// INSERINDO OS DADOS
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);

		em.getTransaction().commit(); // CONFIRMA A TRANSAÇÃO
	}
}
