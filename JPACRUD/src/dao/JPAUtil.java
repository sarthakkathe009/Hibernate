package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory factory;
	private static EntityManager em;
	static
	{
		factory=Persistence.createEntityManagerFactory("PUnit");
		em=factory.createEntityManager();
	}
	public static EntityManager getEntityManager() {
		return em;
	}
}

//By using the isOpen() method, the code 
//checks the state of the EntityManager to determine whether to create 
//a new instance or reuse an existing one. This helps in ensuring that the EntityManager is in 
//a valid and open state before returning it from the getEntityManager() method.