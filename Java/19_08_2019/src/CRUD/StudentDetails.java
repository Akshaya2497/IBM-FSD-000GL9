package CRUD;

public class StudentDetails {
	private int id,gpa;
	private String fname,lname;
	public StudentDetails() {
		
	}
	public void setDetails(int _id, String fnm, String lnm, int _gpa) {
		this.id = _id;
		this.fname = fnm;
		this.lname=lnm;
		this.gpa = _gpa;
		
				
	}
	
}
