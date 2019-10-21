package comm.users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserDao {
	

		public static Connection getConnection(){
			Connection con=null;
			try{
				
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userbean","root","root");
			}catch(Exception e){System.out.println(e);}
			return con;
		}
		public static int isValid(String _name, String _pass){
			int status=0;
			String pass=null;
			try{
				Connection con=UserDao.getConnection();
				PreparedStatement ps=con.prepareStatement("select pass from user where name=?");
				
				ps.setString(1,_name);
				ResultSet rs=ps.executeQuery();
				if(rs.next()){					
					pass=rs.getString(1);					
					
				}
				System.out.println(pass);
				if(_pass.equals(pass))
					status=1;
				
				status=ps.executeUpdate();
				con.close();
				
			}catch(Exception ex){
				
				ex.printStackTrace();}
			
			return status;
		}
}
