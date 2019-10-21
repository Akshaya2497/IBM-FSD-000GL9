package EmployeeMethods;

import JDBCPractice.Employee;
import JDBCPractice.MyConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpIpl implements EmpInterface {
	
	private MyConnectionFactory factory=null;
	private Connection con=null;
	private PreparedStatement ps=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	

	public EmpIpl() throws SQLException {
		super();
		factory=MyConnectionFactory.createObject();
		con=factory.getConnection();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		List<Employee> list=new ArrayList<Employee>();
		try {
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from employee");
			while(rs.next()) {
				list.add(new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void createEmp(Employee emp) {
		// TODO Auto-generated method stub
		try {
			ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setInt(1,emp.getId());
			ps.setString(2, emp.getFname());
			ps.setString(3, emp.getLname());
			ps.setString(4, emp.getEmail());
			ps.execute(); 
			
		}catch(SQLException e) {
			System.err.println("Duplicate Id");
			e.printStackTrace();
		}finally{
			System.out.println("Prgm executed");
		}
		
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
