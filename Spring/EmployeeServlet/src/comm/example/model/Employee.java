package comm.example.model;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * 
	 */
	public int serialVersionUID = 100;
	private int id;
	private String ename,pass,email,country;
	public Employee() {
		
	}
	public Employee(String ename, String pass, String email, String country) {
		super();
		this.ename = ename;
		this.pass = pass;
		this.email = email;
		this.country = country;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	

}
