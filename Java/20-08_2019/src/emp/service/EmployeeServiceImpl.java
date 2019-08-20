package emp.service;

import java.sql.SQLException;
import java.util.List;


import emp.model.Employee;
import empl.dao.EmployeeDao;
import empl.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao dao = null;
	
	public EmployeeServiceImpl() throws SQLException {
		super();
		dao = new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		dao.createEmployee(employee);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
		 
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
