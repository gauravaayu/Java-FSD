package ValidationDemo;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/DashboardServlet")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		 PrintWriter out = resp.getWriter();
		 resp.setContentType("text/html");
		 out.println("<b>you are succesfully login</b><br />");
		 
		 out.println("<form action='LoginServlet' method='POST'>");
		out.println("<h2><b> Welcome user to the page (:</b> <br></h2>");
		 out.println("<input type='submit' value='Logout' formaction='index.html'>");
		 out.println("</form>");
	}
}
