package dev.sgp.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.util.Constantes;

public class GestionnairePersistence {
	
	public void updateCollabs() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("collaborateurs");
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<Collaborateur> query = manager.createQuery("select collab from Collaborateur collab", Collaborateur.class);
		Constantes.COLLAB_SERVICE.setCollaborateurs(query.getResultList());
		
		manager.close();
		factory.close();
	}

	public void persistCollab(Collaborateur collab) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("collaborateurs");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(collab);
		transaction.commit();
		manager.close();
		factory.close();
	}
	
	public void updateDeps() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("collaborateurs");
		EntityManager manager = factory.createEntityManager();

		TypedQuery<Departement> query2 = manager.createQuery("select dep from Departement dep", Departement.class);
		Constantes.DEPART_SERVICE.setDepartements(query2.getResultList());
		
		manager.close();
		factory.close();
	}
	
	public void persistDep(Departement dep) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("collaborateurs");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(dep);
		transaction.commit();
		manager.close();
		factory.close();
	}
}
