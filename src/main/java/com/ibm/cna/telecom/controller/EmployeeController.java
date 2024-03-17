package com.ibm.cna.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cna.telecom.model.Address;
import com.ibm.cna.telecom.model.Employee;
import com.ibm.cna.telecom.service.AddressService;
import com.ibm.cna.telecom.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private AddressService addressService;

	//emp with address- employee with multiple address
	
	@PostMapping("/saveEmpAdd")
	ResponseEntity<Employee> saveEmployeeAddress(@RequestBody Employee employee) {
		Employee employees = employeeService.saveEmployee(employee);
		/*
		 * List<Address> add = employees.getAddress(); for (Address address : add) {
		 * addressService.saveAddress(address); }
		 */
		return ResponseEntity.ok().body(employees);

	}
	
	

}
