package comm.example.Spring_Project.bean;

public class AddressSErviceImpl implements AddressService {
	private String line1,line2,city;
	
	public AddressSErviceImpl() {
		super();
	}

	public AddressSErviceImpl(String line1, String line2, String city) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}

	public String getAddress() {
		// TODO Auto-generated method stub
		return "chennai";
	}

}
