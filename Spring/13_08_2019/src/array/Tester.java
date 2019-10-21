package array;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack =  new Stack();
		int i=stack.pusharr(10);
		i=stack.pusharr(20);
		i=stack.pusharr(30);
		i=stack.poparr();
		i=stack.pusharr(40);
		stack.show();
		System.out.println("**********");
		i=stack.pusharr(30);
		i=stack.pusharr(50);
		i=stack.poparr();
		i=stack.pusharr(60);
		stack.show();
		i=stack.pusharr(70);
		

	}

}
