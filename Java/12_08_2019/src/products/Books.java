package products;

public class Books extends Product {
	private String bName,bAuthor;
	
	public Books(String bname, String bauthor,int rate) {
		// TODO Auto-generated constructor stub
		super.setItems();
		super.setRate(rate);
		this.bName=bname;
		this.bAuthor=bauthor;
	}
	public String getDetails() {
		return super.getItems()+super.getRate()+"Book name= "+bName+" book author"+ bAuthor;
	}
}
 