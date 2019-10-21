package ContactInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Contact> list = new ArrayList<Contact>();
		Contact contact = new Contact();
		Scanner sc =  new Scanner(System.in);
		String name,email,address;
		long mobile;
		System.out.println("Enter the number of user");
		int usercount= sc.nextInt();
		sc.nextLine();
		do {
			System.out.println("Enter name");
			 name= sc.next();
			System.out.println("Enter email");
			 email= sc.next();
			System.out.println("Enter address");
			 address= sc.next();
			System.out.println("Enter mobile number");
			 mobile= 
			usercount--;
		}while(usercount>0);
		
		contact = new Contact(name,email,address,mobile);
		 System.out.println("Then contact list after sorted is ");
		 Collections.sort(list);
		 for(Contact c:list) {
			 System.out.println(c);
		 }

	}

}
