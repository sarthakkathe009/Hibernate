package com.hib.client;

import java.util.HashSet;
import java.util.Set;

import com.hib.entities.Address;
import com.hib.entities.Person;
import com.hib.entities.Student;
import com.hib.service.PersonService;
import com.hib.service.PersonServiceImpl;

public class OneToManyDriver {

	public static void main(String[] args) {
		Address addobj;
		Person perobj;
		PersonService perservice;
		
		addobj=new Address();
		addobj.setStreet("Lamington Road");
		addobj.setCity("Mumbai");
		addobj.setPincode(4000001);
		
		perobj=new Person();
		perobj.setName("Jyotsna Jagdale");
		perobj.setContactNo("9423918465");
		perobj.setAddress(addobj);
		
		perservice=new PersonServiceImpl();
		
		Set<Student> studentSet=new HashSet<Student>();
		Student studobj=new Student();
		studobj.setRollNo(11);
		studobj.setName("Sarthak");
		studobj.setCourse("BE");
		studobj.setPer(78.85f);
		studentSet.add(studobj);
		
		studobj=new Student();
		studobj.setRollNo(8);
		studobj.setName("Sarvesh");
		studobj.setCourse("MS");
		studobj.setPer(80.34f);
		studentSet.add(studobj);
		
		studobj=new Student();
		studobj.setRollNo(24);
		studobj.setName("Rohit");
		studobj.setCourse("BTech");
		studobj.setPer(90.05f);
		studentSet.add(studobj);
		
		studobj=new Student();
		studobj.setRollNo(62);
		studobj.setName("Khushali");
		studobj.setCourse("MCA");
		studobj.setPer(69.63f);
		studentSet.add(studobj);
		
		perobj.setStudents(studentSet);
		perservice.addPerson(perobj);
	}

}
