package com.sampleProject.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sampleProject.springboot.cruddemo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
