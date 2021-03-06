package com.example.demo.entity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;




@Entity
@Table(name = "employee")
public class Employee {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long associateId;	
	
	private String associateFirstName;
	private String associateLastName;

	private String emailId;

	private long mobileNumber;
	
	

	public Employee() {
		super();
	}    

	

	public Employee(String associateFirstName, String associateLastName, @Email String emailId, long mobileNumber) {
		super();
		this.associateFirstName = associateFirstName;
		this.associateLastName = associateLastName;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		
	}



	public long getAssociateId() {
		return associateId;
	}

	public void setAssociateId(long associateId) {
		this.associateId = associateId;
	}

	

	public String getAssociateFirstName() {
		return associateFirstName;
	}

	public void setAssociateFirstName(String associateFirstName) {
		this.associateFirstName = associateFirstName;
	}

	public String getAssociateLastName() {
		return associateLastName;
	}

	public void setAssociateLastName(String associateLastName) {
		this.associateLastName = associateLastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	
		
	
	
}
