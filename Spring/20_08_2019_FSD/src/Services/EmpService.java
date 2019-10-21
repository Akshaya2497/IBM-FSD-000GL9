package Services;

import java.util.List;

import JDBCPractice.Employee;

public interface EmpService {
	public void createEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee getEmployeeById(int id);
}
