package com.example.demo.shared;

import java.util.Set;
import java.util.UUID;



public class EmployeeDto {
	private String uId;
	private String associateName;
	private String mailId;
	private String mobileNumber;
	
	
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public EmployeeDto(String uId, String associateName, String mailId, String mobileNumber) {
		super();
		this.uId = uId;
		this.associateName = associateName;
		this.mailId = mailId;
		this.mobileNumber = mobileNumber;
	}



	public String getAssociateName() {
		return associateName;
	}
	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}