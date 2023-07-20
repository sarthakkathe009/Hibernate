package com.tns.client;

import com.tns.entities.Person;
import com.tns.entities.Student;
import com.tns.service.PersonService;
import com.tns.service.PersonServiceImpl;
import com.tns.service.StudentService;
import com.tns.service.StudentServiceImpl;

public class JPAInheritanceDriver {

	public static void main(String[] args) {
		PersonService service;
		service=new PersonServiceImpl();
		Person p = new Person(); 
		p.setId(103);
		p.setName("John");
		p.setCity("USA");
		service.addPerson(p);
		
		StudentService sservice;
		sservice=new StudentServiceImpl();
		
		Student s=new Student();
		s.setId(104);
		s.setCity("Mumbai");
		s.setName("Pushkar");
		s.setCourse("MS");
		s.setPer(89);

		sservice.addStudent(s);
		
		sservice.getStudent(102);
	}

}
