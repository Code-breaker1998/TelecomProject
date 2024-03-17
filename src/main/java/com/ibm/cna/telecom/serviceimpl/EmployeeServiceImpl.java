package com.ibm.cna.telecom.serviceimpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.cna.telecom.model.Employee;
import com.ibm.cna.telecom.repository.EmployeeRepository;
import com.ibm.cna.telecom.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	private EmployeeRepository repo;

	@Override
	public Employee saveEmployee(Employee employee) {
		logger.info("Employee Service Implementation : savePolicy() method");
		return repo.save(employee);
	}
}
