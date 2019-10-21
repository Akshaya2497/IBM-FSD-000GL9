package comm.example.dao;

import java.util.*;

import comm.example.model.Employee;


import java.sql.*;

public class EmployeeDao {

	public static Connection getConnection(){
		Connection con=null;
		try{
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeservlet","root","root");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	public static int save(Employee e){
		int status=0;
		try{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into employee(ename,pass,email,country) values (?,?,?,?)");
			ps.setString(1,e.getEname());
			ps.setString(2,e.getPass());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int update(Employee e){
		int status=0;
		try{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("update employee set ename=?,pass=?,email=?,country=? where id=?");
			ps.setString(1,e.getEname());
			ps.setString(2,e.getPass());
			ps.setString(3,e.getEmail());
			ps.setString(4,e.getCountry());
			ps.setInt(5,e.getId());
			
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return status;
	}
	public static int delete(int id){
		int status=0;
		try{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("delete from employee where id=?");
			ps.setInt(1,id);
			status=ps.executeUpdate();
			
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return status;
	}
	public static Employee getEmployeeloyeeById(int id){
		Employee e=new Employee();
		
		try{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				e.setId(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setPass(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
			}
			con.close();
		}catch(Exception ex){ex.printStackTrace();}
		
		return e;
	}
	public static List<Employee> getAllEmployeeloyees(){
		List<Employee> list=new ArrayList<Employee>();
		
		try{
			Connection con=EmployeeDao.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from employee");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Employee e=new Employee();
				e.setId(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setPass(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setCountry(rs.getString(5));
				list.add(e);
			}
			con.close();
		}catch(Exception e){e.printStackTrace();}
		
		return list;
	}
}