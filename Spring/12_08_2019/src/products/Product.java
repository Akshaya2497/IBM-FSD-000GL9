package products;

public class Product {
	private static int items=0;
	private  int rate;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public static int getItems() {
		return items;
	}
	public static void setItems() {
		Product.items++;
	}
	public  int getRate() {
		return rate;
	}
	public  void setRate(int rate) {
		this.rate = rate;
	}
	public String getDetails() {
		//return super.getItems()+super.getRate()+"Book name= "+bName+" book author"+ bAuthor;
		return "abc";
	}
	
	

}
