package employeepack;

public class permanentEmp extends Employee{
	private int salary;
	public permanentEmp() {
		
	}
public permanentEmp(int sal) {
		super(1,"Steve","Rogers","Finance");
		this.salary=sal;
		
	}
public String getDetails() {
	return super.getDetails()+" Salary = "+salary;
}
	
}
