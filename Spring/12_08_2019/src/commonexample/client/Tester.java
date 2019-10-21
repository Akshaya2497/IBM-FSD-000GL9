package commonexample.client;
import commonexample.Date;
import constructor.chaining.ConstructorChaining;
public class Tester {
	public static void main(String[] args) {
		Date myDate = null;
		// new Date().createDate(2,3,1997)---- orphan object
		myDate = new Date();
		ConstructorChaining cons= new ConstructorChaining();
		cons.getConsDetails();
		//myDate.createDate(12,12,1998);
		//System.out.println(myDate.getDetails());
		System.out.println(myDate.getDate());
		System.out.println(myDate.getMonth());
		//System.out.println(myDate.getYear());
		System.out.println(new Date().getDetails());
		
		
		
	}
}
