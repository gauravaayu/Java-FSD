package HttpSessionDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        PrintWriter out=  resp.getWriter();
		
		//neededto read html type
		resp.setContentType("text/html");
		
		
		HttpSession session= req.getSession(false);
		
		
		if(session!=null) {
			
			String userFromSession=(String) session.getAttribute("key");
			
			if(userFromSession!=null) {
				out.print("User Exist "+userFromSession);
				out.print("<a href='LogoutServlet'>Logout</a>");
			}
			
		}
		else {
			out.print("Kindly Login First");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}
