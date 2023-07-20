package com.hib.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	static {
		factory=Persistence.createEntityManagerFactory("PUnit");
		em=factory.createEntityManager();
	}
	
	public static EntityManager getEntityManager() {
		return em;
	}
	
	public static void beginTransaction() {
		em.getTransaction().begin();
	}
	
	public static void commitTransaction() {
		em.getTransaction().commit();
	}
}

//By calling Persistence.createEntityManagerFactory("PUnit"), the code creates an EntityManagerFactory based on the 
//configuration defined in the persistence.xml file for the persistence unit named "PUnit". 
//The EntityManagerFactory will be configured with the specified settings and mappings, 
//allowing the application to interact with the underlying database.