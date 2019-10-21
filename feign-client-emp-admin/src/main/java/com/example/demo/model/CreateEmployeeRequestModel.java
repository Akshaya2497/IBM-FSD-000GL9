package com.example.demo.model;


import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateEmployeeRequestModel {
	private String associateName;
	private String mailId;
	private String mobileNumber;
	
	
	public CreateEmployeeRequestModel(String associateName, String mailId, String mobileNumber) {
		super();
		this.associateName = associateName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
	}
	
}