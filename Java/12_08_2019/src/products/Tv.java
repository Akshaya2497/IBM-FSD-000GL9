package products;

public class Tv extends Electronics {
	private String name;
	public Tv() {
		// TODO Auto-generated constructor stub
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name, int manufact) {
		super.setManufactYear(manufact);
		this.name = name;
		
	}
	public String getDetails() {
		return getManufactYear()+name;
	}
	
}
