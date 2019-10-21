package passwordvalidation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		if(UserMainCode.checkPassword(sc.next())) {
			System.out.println("Valid Password");
			}
		else {
			System.out.println("InValid Password");
		}
		
	}

}
