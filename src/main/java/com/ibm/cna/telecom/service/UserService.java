package com.ibm.cna.telecom.service;

import java.util.List;

import com.ibm.cna.telecom.model.User;

public interface UserService {
	
	public User loginUser(String username, String password)throws Exception;

	public User saveUser(User user);
	
	public List<User> getListByCity(String city);

	public User getById(Integer id);
	
}
                                                     




