package com.example.demo.model;

import java.util.Set;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class CreateEmployeeResponseModel {
	
	private String associateName;
	private String mailId;
	private String mobileNumber;
	private String uId;
	
	public CreateEmployeeResponseModel() {
		super();
	}

	public CreateEmployeeResponseModel(String associateName, String mailId, String mobileNumber, String uId) {
		super();
		this.associateName = associateName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
		this.uId = uId;
	}

		
}