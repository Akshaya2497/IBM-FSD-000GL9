package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class StudentService{
	
	private static Properties properties = null;
	private static Scanner scanner = new Scanner(System.in);
	private Connection connection;
	static {
		properties = new Properties();
		properties.put("JDBC_URL", "jdbc:mysql://localhost:3306/studentdb");
		properties.put("USER", "root");
		properties.put("PASSWORD", "root");
	}
	public StudentService() throws ClassNotFoundException, SQLException  {
		MySqlConnectionFactory factory = MySqlConnectionFactory.createConnection();
		connection = factory.getConnection();
		
	}
	public void insertStudent() throws ClassNotFoundException, SQLException {
		
		PreparedStatement pst = connection.prepareStatement("insert into studDetails values(?,?,?)");
		System.out.print("ID: ");
		int id = scanner.nextInt();
		System.out.print("NAME: ");
		String name = scanner.next();
		System.out.print("gpa: ");
		int gpa = scanner.nextInt();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setInt(3, gpa);
		int count = pst.executeUpdate();
		System.out.println(count + " row(s) updated");
	}
public void deleteStudent() throws ClassNotFoundException, SQLException {
		
		PreparedStatement pst = connection.prepareStatement("DELETE FROM studDetails WHERE id = ?;");
		System.out.print("ID: ");
		int id = scanner.nextInt();
		
		pst.setInt(1, id);
		
		int count = pst.executeUpdate();
		System.out.println(count + " row(s) deleted");
	}
}
