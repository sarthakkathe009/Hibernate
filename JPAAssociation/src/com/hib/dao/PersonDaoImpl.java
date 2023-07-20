package com.hib.dao;

import javax.persistence.EntityManager;

import com.hib.entities.Person;

public class PersonDaoImpl implements PersonDao {
	private EntityManager em;
	public PersonDaoImpl()
	{
		em=JPAUtil.getEntityManager();
	}
	@Override
	public void addPerson(Person person) {
		JPAUtil.beginTransaction();
		em.persist(person);
		JPAUtil.commitTransaction();
	}

	@Override
	public Person getPerson(int id) {
		Person p=em.find(Person.class,id);
		return p;
	}


}
