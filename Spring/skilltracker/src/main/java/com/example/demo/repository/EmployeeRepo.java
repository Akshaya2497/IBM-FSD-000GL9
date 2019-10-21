package com.example.demo.repository;


import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Long> {
   //public Employee findByAssociateId(long id);
	public List<Employee> findByAssociateFirstName(String fname);
	public List<Employee> findByAssociateLastName(String lname);	
	public List<Employee> findByEmailId(String email);
	public Employee findByMobileNumber(long number);
		
	
}