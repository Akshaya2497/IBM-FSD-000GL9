package com.example.demo.model;


public class LeagueRequestModel {
	private int id;
	
	private String name;
	
	private String season;
	public LeagueRequestModel() {
		
	}
	
	public LeagueRequestModel(String name, String season) {
		super();
		this.name = name;
		this.season = season;
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
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	

}
