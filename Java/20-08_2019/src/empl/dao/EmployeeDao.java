package empl.dao;

import java.util.List;

import emp.model.Employee;

public interface EmployeeDao {
	public void createEmployee(Employee employee);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(int id);
}
