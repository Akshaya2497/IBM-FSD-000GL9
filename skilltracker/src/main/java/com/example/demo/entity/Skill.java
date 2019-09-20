package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Skill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long skillId;
	
	private String skill;
	private String subSkill;
	@ManyToOne
	@JoinColumn(name="associateId")
	private Employee employee;
	
	
	public Skill() {
		super();
	}

public Skill(String skill, String subSkill) {
	super();
	this.skill=skill;
	this.subSkill=subSkill;
}
	public Skill(String skill, String subSkill, Employee employee) {
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
