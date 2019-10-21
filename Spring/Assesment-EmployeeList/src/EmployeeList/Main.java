package EmployeeList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Input the number of employees : ");
		int numOfEmp=sc.nextInt();
		List<Employee> l=new ArrayList<Employee>();
		for(int i=0;i<numOfEmp;i++) {
			System.out.printf("Enter the details for employee %d",(i+1));
			String name=sc.next();
			String department=sc.next();
			SimpleDateFormat sdfo = new SimpleDateFormat("dd/MM/yyyy");
			String d1=sc.next();
			Date d2=sdfo.parse(d1);
			int age=sc.nextInt();
			int salary=sc.nextInt();
			l.add(new Employee(l.size()+1,name,department,d2,age,salary));
		}
		int ch;
		do {
			System.out.println("\n1)Sort Employees by Salary\n2)Sort employees by age and by date of joining\nEnter your Choice");
			ch=sc.nextInt();
			switch(ch) {
				case 1:{
					Collections.sort(l, new AgeComparator());
					new EmployeeBO().printEmployees(l);
					break;
				}
				case 2:{
					Collections.sort(l,new AgeComparator());
					new EmployeeBO().printEmployees(l);
					break;
				}
				default:{
					System.exit(0);
				}
			}

		}while(ch>0 && ch<3);
		sc.close();
	}
		
	}


