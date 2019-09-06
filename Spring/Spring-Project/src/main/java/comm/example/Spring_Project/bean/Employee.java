package comm.example.Spring_Project.bean;

public class Employee {
	private int id;
	private String fname,lname;
	public AddressSErviceImpl addressService;
	public Employee() {
		
	}
	
	public Employee(AddressSErviceImpl addressService) {
		super();
		this.addressService=addressService;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return addressService.getAddress();
	}

}
