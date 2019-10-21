package Services;

import java.sql.SQLException;
import java.util.List;

import EmployeeMethods.EmpIpl;
import JDBCPractice.Employee;

public class EmpServiceIpl implements EmpService {
	
	private EmpIpl dao=null;
	public EmpServiceIpl() throws SQLException {
		super();
		dao=new EmpIpl();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.createEmp(emp);

	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmp(); 
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
