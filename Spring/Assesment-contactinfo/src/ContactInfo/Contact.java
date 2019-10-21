package ContactInfo;

public class Contact implements Comparable<Object> {
	String name,email,address;
	long mobile ;
	
	public Contact() {
		
	}
	public Contact(String _name, String _email, String _address, long _mbl) {
		super();
		this.name = _name;
		this.email = _email;
		this.address = _address;
		this.mobile = _mbl;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	
	@Override
	public int compareTo(Object o) {
		Contact c=(Contact)o;
		if(this.mobile==c.getMobile())
			return 0;
		else if(this.mobile>c.getMobile())
			return 1;
		else 
			return -1;
	}
	
	
}
