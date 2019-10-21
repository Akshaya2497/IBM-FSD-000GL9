package comm.example;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="customer")

public class Customer {
	@Id
	
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name="fname")	 
	private String fname;
	@Column(name = "lname")
	private String lname;
	@Column(name = "email")
	private String email;
	public Customer() {
		super();
	}
	public Customer(int id, String fname, String lname, String email) {
		super();
		this.id = UUID.randomUUID().toString();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
