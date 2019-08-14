package innerclass;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Outerclass out = new Outerclass();
		Outerclass.Innerclass inner = new Outerclass().new Innerclass();
		inner.showinner();
		Outerclass.Innerclass.Innerclass2  inner2=  new Outerclass().new Innerclass().new Innerclass2();
		inner2.showinner2();
	}

}
