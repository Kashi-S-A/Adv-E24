package com.tyss.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
