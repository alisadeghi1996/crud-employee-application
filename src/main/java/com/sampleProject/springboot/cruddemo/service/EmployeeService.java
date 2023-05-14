package com.sampleProject.springboot.cruddemo.service;

import java.util.List;

import com.sampleProject.springboot.cruddemo.model.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
