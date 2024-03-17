package com.ibm.cna.telecom.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.cna.telecom.model.Address;
import com.ibm.cna.telecom.repository.AddressRepository;
import com.ibm.cna.telecom.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	private static final Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

	@Autowired
	private AddressRepository repo;

	@Override
	public Address saveAddress(Address address) {
		logger.info("Employee Service Implementation : savePolicy() method");
		logger.debug("this is debug line");
		return repo.save(address);
	}
}
