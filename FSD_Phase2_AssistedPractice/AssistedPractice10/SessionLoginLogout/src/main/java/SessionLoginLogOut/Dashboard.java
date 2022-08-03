package SessionLoginLogOut;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        
        HttpSession session=req.getSession(false);  
        String userId = null;
        if (session.getAttribute("userid") != null)
            userId =(String)session.getAttribute("userid");  
        if (userId == null ) {
            out.println("No UserId was found in session.<br>");
        } else {
            out.println("UserId obtained from session :" + userId + "<br>");
            out.println("<a href='Logout'>Logout of session</a><br>");
        }
        out.println("</body></html>");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	

}
