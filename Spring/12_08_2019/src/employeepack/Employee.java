package employeepack;

public class Employee {
	private int eid;
	private String firstName, lastName, department;
	public Employee() {
		
	}
	public Employee(int id, String fName, String lName,String dept) {
		this.eid = id;
		this.firstName = fName;
		this.lastName = lName;
		this.department = dept;
	}
	protected String getDetails() {
		return "id = "+eid+" first name = " +firstName +" Last Name = "+lastName+" Department"+department;
	}
	
}
