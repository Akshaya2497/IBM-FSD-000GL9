package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Employee;
import com.example.demo.interfce.AdminInterface;
import com.example.demo.interfce.EmployeeInterface;
import com.example.demo.model.CreateEmployeeResponseModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RestController
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AppController {
	
	@Autowired
	private EmployeeInterface employeeInterface;
	@Autowired
	private AdminInterface adminInterface;
	
		@RequestMapping("/")
		public String home() {
			return "home";
		}
		
		@GetMapping("/fetchEmployee")
		public List<Employee> listEmployee() {
			List<Employee> employee =employeeInterface.findAll();
			return employee;
		}
		
		@GetMapping("/fetchEmployee/id/{id}")
		public Employee searchEmployeeById(@PathVariable("id") int id) {
			Employee employee =employeeInterface.findByAssociateId(id);
			return employee;
		}

		@GetMapping("/fetchEmployee/name/{name}")
		public Employee searchEmployeeByName(@PathVariable("name") String name) {
			Employee employee =employeeInterface.findByAssociateName(name);
			return employee;
		}

		@GetMapping("/fetchEmployee/email/{email}")
		public Employee searchEmployeeByEmail(@PathVariable("email") String email) {
			Employee employee =employeeInterface.findByMailId(email);
			return employee;
		}

		@GetMapping("/fetchEmployee/mobile/{mobile}")
		public Employee searchEmployeeByMobile(@PathVariable("mobile") String mobile) {
			Employee employee =employeeInterface.findByMobileNumber(mobile);
			return employee;
		}

		@RequestMapping("/fetchAdmin")
		public List<Admin> listAdmin() {
			List<Admin> admin =adminInterface.getAdmin();
			return admin;
		}
		
}
