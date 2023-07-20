package com.hib.client;

import com.hib.entities.Address;
import com.hib.entities.Person;
import com.hib.service.AddressService;
import com.hib.service.AddressServiceImpl;
import com.hib.service.PersonService;
import com.hib.service.PersonServiceImpl;

public class OneToOneDriver {
	public static void main(String[] args) {
		PersonService perservice;
		Person perobj;
		AddressService addrservice;
		Address addobj;
		
		addobj=new Address();
		addobj.setStreet("Kothrud");
		addobj.setCity("Pune");
		addobj.setPincode(400037);
		
		perobj=new Person();
		perobj.setName("Sai");
		perobj.setContactNo("9850796354");
		perobj.setAddress(addobj);
		
		addrservice=new AddressServiceImpl();
		perservice=new PersonServiceImpl();
		
		addrservice.addAddress(addobj);
		perservice.addPerson(perobj);
		
		Person p=perservice.getPerson(2);
		System.out.println(p);
		
	}
}
