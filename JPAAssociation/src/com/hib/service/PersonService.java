package com.hib.service;

import com.hib.entities.Person;

public interface PersonService {
	void addPerson(Person person);
	Person getPerson(int id);
}
