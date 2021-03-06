package comm.example.service;

import comm.example.model.Employee;


import java.util.List;


public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
	public void getMetadata();
}
