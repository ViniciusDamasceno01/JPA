package Aplicacao;

import Dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa"); // INSTANCIANDO O ENTITY																	// MANEGER FACTORY
		EntityManager em = emf.createEntityManager(); // INSTANCIANDO O ENTITY MANAGER, RESPONSAVEL PELAS OPERAÇÕES DE
														// PERSISTENCIA
		Pessoa p = em.find(Pessoa.class, 2);

		System.out.println(p);

		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
