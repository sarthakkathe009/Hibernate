package com.hib.service;

import com.hib.entities.Address;

public interface AddressService {
	void addAddress(Address address);
	Address getAddress(int id);
}
