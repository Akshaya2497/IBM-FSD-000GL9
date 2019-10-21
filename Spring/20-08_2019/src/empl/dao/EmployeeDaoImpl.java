package empl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import emp.factory.MyConnectionFactory;
import emp.model.Employee;



public class EmployeeDaoImpl implements EmployeeDao {
	private MyConnectionFactory factory=null;
	private Connection connection=null;
	private PreparedStatement pst=null;	
	private ResultSet rs=null;
	
	public EmployeeDaoImpl() throws SQLException {
		super();
		factory=MyConnectionFactory.createObject();
		connection=factory.getConnection();
		
	}	
	
	
	@Override
	public void createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		try {
			pst=connection.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getFname());
			pst.setString(3, employee.getLname());
			pst.setString(4, employee.getEmail());
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("duplicate id");
			
			e.printStackTrace();
		}
		
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		try {
		pst = connection.prepareStatement("SELECT * FROM employee;");
		rs=pst.executeQuery();  
		while(rs.next()){
			list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));  
		}}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

