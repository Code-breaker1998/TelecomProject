package com.ibm.cna.telecom.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.cna.telecom.exception.LifeInsuranceException;
import com.ibm.cna.telecom.model.User;
import com.ibm.cna.telecom.repository.UserRepository;
import com.ibm.cna.telecom.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User loginUser(String username, String password) {
		User user = userRepository.findByUsername(username);
		System.out.println("******"+username);
		System.out.println(password);
		if (user == null) {
			throw new LifeInsuranceException("You entered incorrect username.");
		} else {
			if (user.getUserpwd().equals(password)) {
				return user;
			}
			throw new LifeInsuranceException("You entered incorrect password.");
		}
	}

	@Override
	@Transactional
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getListByCity(String city) {
		List<User> user = userRepository.findByCity(city);
		return user;
	}

	@Override
	public User getById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}
}
