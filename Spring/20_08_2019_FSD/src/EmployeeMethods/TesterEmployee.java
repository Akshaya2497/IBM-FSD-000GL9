package EmployeeMethods;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import JDBCPractice.Employee;
import Services.EmpService;
import Services.EmpServiceIpl;

public class TesterEmployee {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		EmpService service = new EmpServiceIpl();
		int choice = 0;
		do {
			System.out.println("1)Create Employee\n2)Diaplay All Employees\n 0-To Exit\n Enter Your Choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Employee Id : ");
				int id = sc.nextInt();
				System.out.println("Employee First Name : ");
				String fname = sc.next();
				System.out.println("Employee Last name : ");
				String lname = sc.next();
				System.out.println("Employee email : ");
				String email = sc.next();
				service.createEmployee(new Employee(id, fname, lname, email));
				break;
			case 2:
				List<Employee> list = service.getAllEmployee();
				for (Employee e : list) {
					System.out.printf("\n%d\t%s\t%s\t%s", e.getId(), e.getFname(), e.getLname(), e.getEmail());
				}
				break;
			case 0:
				System.out.println("Break");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Character");
				break;
			}
		} while (choice != 0);
	}
}


