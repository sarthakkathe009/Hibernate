package com.tns.dao;

import com.tns.entities.Person;

public interface PersonDao {
	void addPerson(Person person);
	Person getPerson(int id);
	void beginTransaction();
	void commitTransaction();
}
