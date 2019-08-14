package employeepack;

public class ContractualEmp extends Employee {
	private int ratePerHr;

	public ContractualEmp() {
		// TODO Auto-generated constructor stub
	}
	public ContractualEmp(int rpa) {
		// TODO Auto-generated constructor stub
		super(1,"Tony","Stark","Management");
		this.ratePerHr=rpa;
	}
	public String getDetails() {
		return super.getDetails()+" rate per hour = "+ratePerHr;
	}
	
}
