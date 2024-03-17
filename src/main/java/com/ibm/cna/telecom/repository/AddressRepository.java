package com.ibm.cna.telecom.repository;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.cna.telecom.model.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Serializable>{
	
}
