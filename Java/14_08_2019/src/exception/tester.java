package exception;

import java.util.Scanner;

public class tester {
	public static int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;

		String fname = null;
		String lname = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you choice: 1 for create account... 2 for exit");
		choice = sc.nextInt();
		sc.nextLine();
		NameCheck nmechk[] = new NameCheck[4];
		try {
			
			do {
				System.out.println("i is "+i);
					System.out.println("Enter first name:");
					fname = sc.nextLine();
					System.out.println("Enter last name:");
					lname = sc.nextLine();
				
				
				nmechk[i] = new NameCheck(fname, lname);
				nmechk[i].checkname();
				
				if (i >= 1) {
					//System.out.println("0"+nmechk[0].fName);
					//System.out.println("1"+nmechk[1].fName);
					try {

						for (int j = i - 1; j >= 0; j--) {
							
							nmechk[i].checkduplicate(nmechk[i], nmechk[j]);
						}
					} catch (OjectSameException ose) {
						System.out.println(ose.getMessage());
					}
				}
				i++;
				System.out.println("do you want to continue?");
				choice = sc.nextInt();
				sc.nextLine();
			} while (choice == 1);
			if(choice ==0)
				System.exit(0);
		} catch (NameNotValidException nnve) {
			System.err.println(nnve.getMessage());

		}

	}

}
