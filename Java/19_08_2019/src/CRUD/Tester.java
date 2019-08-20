package CRUD;
import java.sql.SQLException;
import java.util.Scanner;
public class Tester {	
	public Tester() {
		super();

	}
	
	private  static StudentService service;
	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		try {
		service =  new StudentService();
		}
		catch(SQLException sql) {
			sql.printStackTrace();
		}
		System.out.println("Enter your choice.. \n 1.Insert 2.Delete 3.Show All 4.Show particular id 5.Update ");
		Scanner scanner =  new Scanner(System.in);
		int choice=1;
		do {
			choice = scanner.nextInt();
		
		switch(choice) {
		case 1: service.insertStudent();
		break;
		case 2: service.deleteStudent();
		break;
		}
		}while(choice!=0);
		

	}
}

