package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="league")
@Data


public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long leagueId;
	@Column(name="name")
	private String name;
	@Column(name="season")
	private String season;
	
	
	public League(String name, String season) {
		super();
		this.name = name;
		this.season = season;
	}
	public long getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(int leagueId) {
		this.leagueId = leagueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	
	

}
