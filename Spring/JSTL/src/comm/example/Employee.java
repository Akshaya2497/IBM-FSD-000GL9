package comm.example;

public class Employee {
private String name,email;
private int salary;
public Employee() {
	
}
public Employee(String name, String email, int salary) {
	super();
	this.name = name;
	this.email = email;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}

}
