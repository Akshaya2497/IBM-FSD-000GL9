package emp.service;

import java.util.List;

import emp.model.Employee;



public interface EmployeeService {
	public void createEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee getEmployeeById(int id);
}
