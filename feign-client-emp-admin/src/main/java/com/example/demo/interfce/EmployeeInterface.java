package com.example.demo.interfce;

import java.util.List;

import javax.ws.rs.Path;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Employee;

@FeignClient(name="employee-ws")
public interface EmployeeInterface {

	@GetMapping("/employees/list")
	public List<Employee> findAll();
	
	@GetMapping("/employees/id/{id}")
	public Employee findByAssociateId(@PathVariable("id") int id);

	@GetMapping("/employees/name/{name}")
	public Employee findByAssociateName(@PathVariable("name") String name);

	@GetMapping("/employees/email/{email}")
	public Employee findByMailId(@PathVariable("email") String email);

	@GetMapping("/employees/mobile/{mobile}")
	public Employee findByMobileNumber(String mobile);

	
}