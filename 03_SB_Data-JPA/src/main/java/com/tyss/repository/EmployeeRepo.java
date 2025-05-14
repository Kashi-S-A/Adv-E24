package com.tyss.repository;

import org.springframework.data.repository.CrudRepository;

import com.tyss.entity.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
