package com.hib.service;

import com.hib.dao.AddressDao;
import com.hib.dao.AddressDaoImpl;
import com.hib.entities.Address;

public class AddressServiceImpl implements AddressService{
	private static AddressDao dao;
	
	public AddressServiceImpl() {
		dao=new AddressDaoImpl();
	}
	
	@Override
	public void addAddress(Address address) {
		dao.addAddress(address);
	}

	@Override
	public Address getAddress(int id) {
		return dao.getAddress(id);
	}

}
