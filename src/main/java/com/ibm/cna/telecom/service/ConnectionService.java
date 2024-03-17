package com.ibm.cna.telecom.service;

import java.util.Optional;

import com.ibm.cna.telecom.model.Connection;

public interface ConnectionService {
	
	public Iterable<Connection> getAllConnection(); 
	public Connection saveConnection(Connection connection);
	public Optional<Connection> getConnectionById(Integer Id);
	public void deleteConnection(Integer id);
	
}
