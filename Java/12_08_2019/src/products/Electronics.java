package products;

public class Electronics extends Product{
	int manufactYear;
	public Electronics() {
		// TODO Auto-generated constructor stub
		super.setItems();
	}
	public int getManufactYear() {
		return super.getItems()+super.getRate()+manufactYear;
	}
	public void setManufactYear(int manufactYear) {
		this.manufactYear = manufactYear;
	}
	
	public void setrate(int rate) {
		super.setRate(rate);
	}
	
}
