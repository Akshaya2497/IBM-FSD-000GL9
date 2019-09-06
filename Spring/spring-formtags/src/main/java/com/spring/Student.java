package com.spring;

import java.util.LinkedHashMap;

public class Student {

	private String name,department;
	private int year,id;
	private LinkedHashMap<String, String> departmentoptions = null;
	private String[] intrests;
	private String intrest;
	public Student() {
		departmentoptions=new LinkedHashMap<String, String>();
		departmentoptions.put("CS","Computer Science");
		departmentoptions.put("IT","Information Technology");
		departmentoptions.put("CIV","Civil");
	}
	
	
	public Student(String name, String department, int year,String intrests) {
		super();
		this.name = name;
		this.department = department;
		this.year = year;
		this.id = id;
		this.intrest = intrests;
	}


	public String getIntrest() {
		return intrest;
	}


	public void setIntrest(String[] intrest) {
		this.intrest = intrest.toString();
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LinkedHashMap<String, String> getdepartmentoptions() {
		return departmentoptions;
	}

	public void setdepartmentoptions(LinkedHashMap<String, String> departmentoptions) {
		this.departmentoptions = departmentoptions;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String[] getIntrests() {
		return intrests;
	}

	public void setIntrests(String[] intrests) {
		this.intrests = intrests;
	}
	
}
