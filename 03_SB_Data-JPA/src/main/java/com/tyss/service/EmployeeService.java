package com.tyss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.entity.Employee;
import com.tyss.repository.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	
	public Employee saveEmp(Employee employee) {
		Employee emp = repo.save(employee);
		return emp;
	}
}
