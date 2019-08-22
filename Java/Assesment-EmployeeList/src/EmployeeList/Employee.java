package EmployeeList;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Object>{
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		Employee e=(Employee)o;
		if(this.salary==e.getSalary())
			return 0;
		else if(this.salary>e.getSalary())
			return 1;
		else 
			return -1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String res=String.format("%-15s %-30s %-30s %-20s %-10s %-10s\n", this.id,this.name,this.department,dateFormat.format(this.dateOfJoining),this.age,this.salary);
		return res;
	}

}