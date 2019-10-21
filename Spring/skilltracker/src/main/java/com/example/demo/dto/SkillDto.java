package com.example.demo.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.example.demo.entity.Employee;

public class SkillDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long skillId;
	
	private String skill;
	private String subSkill;
	@ManyToOne
	@JoinColumn(name="associateId")
	private Employee employee;
	
	
	public SkillDto() {
		super();
	}


	public SkillDto(String skill, String subSkill, Employee employee) {
		super();
		this.skill = skill;
		this.subSkill = subSkill;
		this.employee = employee;
	}


	public long getSkillId() {
		return skillId;
	}


	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}


	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}


	public String getSubSkill() {
		return subSkill;
	}


	public void setSubSkill(String subSkill) {
		this.subSkill = subSkill;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
