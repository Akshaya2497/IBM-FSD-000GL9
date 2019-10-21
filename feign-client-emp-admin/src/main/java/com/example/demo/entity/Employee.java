package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	private int associateId;
	private String associateName;
	private String mailId;
	private String mobileNumber;
	private String uId;
	public Employee(String associateName, String mailId, String mobileNumber, String uId) {
		super();
		this.associateName = associateName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
		this.uId = uId;
	}
	
}
