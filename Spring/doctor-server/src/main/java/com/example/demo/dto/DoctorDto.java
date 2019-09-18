package com.example.demo.dto;



public class DoctorDto {
	private long id;
	
	private String name;
	
	private String speciality;
	
	
	private String disease;

	public DoctorDto(String name, String speciality, String disease) {
		super();
		this.name = name;
		this.speciality = speciality;
		this.disease = disease;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	

}
