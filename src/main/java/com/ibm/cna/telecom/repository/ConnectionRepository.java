package com.ibm.cna.telecom.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.cna.telecom.model.Connection;

@Repository
public interface ConnectionRepository extends CrudRepository<Connection, Serializable>{
	
}
