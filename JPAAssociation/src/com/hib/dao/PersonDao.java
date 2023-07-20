package com.hib.dao;

import com.hib.entities.Person;

public interface PersonDao {
	void addPerson(Person person);
	Person getPerson(int id);
}
