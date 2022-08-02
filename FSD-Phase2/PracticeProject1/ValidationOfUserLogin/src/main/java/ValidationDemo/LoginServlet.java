package ValidationDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username =req.getParameter("uname");
		String password =req.getParameter("pass");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if(username.equals("gaurav") && password.equals("123")) {
			resp.sendRedirect("DashboardServlet");	
		}
		else {
			out.println("!!!Username and password are invalid!!! ");	
		}	
	}
	
}
