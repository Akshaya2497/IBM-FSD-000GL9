package com.mycompany.spring.service;

import java.util.List;

import com.mycompany.spring.model.Employee;



public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}