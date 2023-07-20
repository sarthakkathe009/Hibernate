package com.tns.service;

import com.tns.entities.Person;

public interface PersonService {
	void addPerson(Person person);
	Person getPerson(int id);
}
