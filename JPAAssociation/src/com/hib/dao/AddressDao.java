package com.hib.dao;

import com.hib.entities.Address;

public interface AddressDao {
	void addAddress(Address address);
	Address getAddress(int id);
}
