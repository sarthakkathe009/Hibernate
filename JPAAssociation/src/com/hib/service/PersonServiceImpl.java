package com.hib.service;

import com.hib.dao.PersonDao;
import com.hib.dao.PersonDaoImpl;
import com.hib.entities.Person;

public class PersonServiceImpl implements PersonService{
	private PersonDao dao;
	
	public PersonServiceImpl() {
		dao=new PersonDaoImpl();
	}
	
	@Override
	public void addPerson(Person person) {
		dao.addPerson(person);
	}

	@Override
	public Person getPerson(int id) {
		return dao.getPerson(id);
	}

}
