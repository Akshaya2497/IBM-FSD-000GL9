package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

@WebServlet("/success.view")
public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();   

		Employee employee = (Employee) request.getAttribute("SUCCESS");
		System.out.println("name"+employee.getEname());
		System.out.println("email"+employee.getEmail());
		EmployeeService service =  new EmployeeServiceImpl();
		service.createEmployee(employee);
		out.println("Name"+employee.getEname()+"<br/>"+"Email"+employee.getEmail()
		+"<br/>"+"Country"+employee.getCountry());
		out.println(employee.getEname());
		out.println("added sucessfully...");

	}
}



