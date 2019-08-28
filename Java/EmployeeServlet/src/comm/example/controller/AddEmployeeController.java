package comm.example.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.model.Employee;
import comm.example.service.EmployeeServiceImpl;

@WebServlet("/add_emp.do")
public class AddEmployeeController extends HttpServlet {
	private String email, name, password, country;

	private List<String> errMsgs;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, SQLException{
		errMsgs = new LinkedList<String>();
		country = request.getParameter("country");
		if (country.equals("Unknown")) {
			errMsgs.add("please select a valid country");
		}

		name = request.getParameter("name");

		for (char c : name.toCharArray()) {
			if (Character.isDigit(c)) {
				errMsgs.add("Name should not include a number");
				break;
			}
		}
		email = request.getParameter("email");
		password = request.getParameter("password");
		int digit = 0, ucase = 0, lcase = 0;

		for (char c : password.toCharArray()) {
			if (Character.isDigit(c))
				digit = 1;
			

			if (Character.isLowerCase(c))
				lcase = 1;
			if (Character.isUpperCase(c))
				ucase = 1;
		}
		if (!(digit == 1 && lcase == 1 && ucase == 1))
			errMsgs.add("Password should include a number, a lowercase and a uppercase");

		if (!errMsgs.isEmpty()) {
			request.setAttribute("ERROR", errMsgs);
			RequestDispatcher view = request.getRequestDispatcher("error.view");
			try {
				view.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			request.setAttribute("SUCCESS", new League(title, season, iYear));
			Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
			PreparedStatement pst=connection.prepareStatement("insert into league(title,season,year,uid) values(?,?,?,?)");
			pst.setString(1, title);
			pst.setString(2, season);
			pst.setInt(3, iYear);
			pst.setInt(4, League.serialVersionUID++);
			pst.executeUpdate();
			RequestDispatcher  view=request.getRequestDispatcher("success.view");
			view.forward(request, response);
		}

	}
}
