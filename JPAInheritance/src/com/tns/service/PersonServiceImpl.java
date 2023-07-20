package com.tns.service;

import com.tns.dao.PersonDao;
import com.tns.dao.PersonDaoImpl;
import com.tns.entities.Person;

public class PersonServiceImpl implements PersonService {
	private PersonDao dao;
	
	public PersonServiceImpl() {
		dao=new PersonDaoImpl();
	}

	@Override
	public void addPerson(Person person) {
		dao.beginTransaction();
		dao.addPerson(person);
		dao.commitTransaction();
	}

	@Override
	public Person getPerson(int id) {
		return dao.getPerson(id);
	}
	
	
}
