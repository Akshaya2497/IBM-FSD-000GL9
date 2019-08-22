package EmployeeList;

import java.util.List;


public class EmployeeBO {

	public void printEmployees(List<Employee> l) {
		// TODO Auto-generated method stub
		for (Employee e : l) {
			System.out.println(e.toString());
		}
	}

}

