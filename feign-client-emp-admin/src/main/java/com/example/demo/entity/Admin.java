package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
	
	private int adminId;
	private String adminName;
	private String adminPass;
	
	public Admin(String adminName, String adminPass) {
		super();
		this.adminName = adminName;
		this.adminPass = adminPass;
	}
	
	

}
