package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import emp.model.Employee;
import emp.service.EmployeeServiceImpl;

public class StringStream {
	private static FileReader in;
	private static FileWriter out;

	public StringStream() {

	}

	/*public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		in = new FileReader(new File("byteinputstream.txt"));
		out = new FileWriter(new File("stringstreamop.txt"));
		BufferedReader ipStream = new BufferedReader(in);
		PrintWriter opStream = new PrintWriter(out);
		String line;
		while ((line = ipStream.readLine()) != null) {
			opStream.println(line);
			System.out.println(line);
		}
		in.close();
		opStream.close();

	}*/

	public static void writefile(String text) throws IOException {
		// TODO Auto-generated method stub
		out = new FileWriter(new File("fileswing.txt"));
		PrintWriter opStream = new PrintWriter(out);

		opStream.println(text);
		opStream.close();
		//opStream.append('\0');
		in = new FileReader(new File("fileswing.txt"));
		BufferedReader ipStream = new BufferedReader(in);
		String line;
		//String s = "";
		
			while ((line = ipStream.readLine()) != null) {
				saveToDB(line);
				
			}
		
		

		

	}

	private static void saveToDB(String text) {
		
		String arr[];
		
		arr=text.split(" ");
		EmployeeServiceImpl service=null;
		try {
			service = new EmployeeServiceImpl();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		service.createEmployee(new Employee(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]));
		
		
		
	}

	public static String readfile() throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
		in = new FileReader(new File("fileswing.txt"));
		BufferedReader ipStream = new BufferedReader(in);
		String line;
		String s = "";
			while ((line = ipStream.readLine()) != null) {
				
				System.out.println(line);
				s+=line+'\n';
			}
		
		in.close();
		return s;
		
		
	}
	

}
