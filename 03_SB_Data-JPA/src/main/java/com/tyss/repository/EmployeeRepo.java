package com.tyss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
}
