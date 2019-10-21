package singletonepattern;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Messaging m =  Messaging.createmessageparams();
		System.out.println(m);
		//Messaging.createmessageparams();
		Messaging m1 =  Messaging.createmessageparams();
		System.out.println("obj2");
		System.out.println(m1);
		
	}

}
