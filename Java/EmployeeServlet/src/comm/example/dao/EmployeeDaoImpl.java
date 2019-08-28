package comm.example.dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import comm.example.model.Employee;
import comm.example.factory.MyConnectionFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	private Connection connection = null;
	private PreparedStatement pst = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public EmployeeDaoImpl() throws SQLException {
		super();
		this.connection = MyConnectionFactory.getMySqlConnectionForEmployee();

	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list = new ArrayList<Employee>();
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			ResultSetMetaData rMetaData = resultSet.getMetaData();
			rMetaData.getColumnCount();
			rMetaData.getColumnLabel(1);
			rMetaData.getColumnName(2);
			rMetaData.getColumnType(2);
//			while (resultSet.next()) {
//				list.add(new Employee(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
//						resultSet.getString(4)));
//			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

	public void getConnectionInfo() {
		try {
			DatabaseMetaData dMetaData = connection.getMetaData();

			System.out.println(dMetaData.getDatabaseProductName());
			System.out.println(dMetaData.getDriverName() + " " + dMetaData.getDatabaseMajorVersion() + " "
					+ dMetaData.getDatabaseMinorVersion());
			dMetaData.getURL();
			dMetaData.getUserName();
		} catch (SQLException e) {

		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createEmployee(Employee e) {
		System.out.println(e.getEname());
		try {
			pst = connection.prepareStatement("insert into employee(uid,ename,pass,email,country)values(?,?,?,?,?)");
			pst.setInt(1, e.serialVersionUID++);
			pst.setString(2, e.getEname());
			pst.setString(3, e.getPass());
			pst.setString(4, e.getEmail());
			pst.setString(5, e.getCountry());
			pst.executeUpdate();

		} catch (SQLException exception) {
			System.out.println("name or email already exists");
			exception.printStackTrace();
		} finally {

		}

	}

}
