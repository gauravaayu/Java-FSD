package ProcedureStored;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	
	//private int id;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		int id=Integer.parseInt(req.getParameter("pid")); 
		String name=req.getParameter("pname");
		
		
		InputStream in=getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		Properties props= new Properties();
		props.load(in);
		
		Connection con=DBConfig.getConnection(props);
		
		try {
			//store procedure is already prepared inside
			//mysql database with name add_product
			//check storeprocedure query.txt file for more information
			
			CallableStatement stmt=con.prepareCall("call add_student(?,?)");
			
			stmt.setInt(1, id);
			stmt.setString(2, name);
			
			int x=stmt.executeUpdate();
			
			if(x>0) {
				out.print("Data  Inserted Successfully");
				//resp.sendRedirect("list");
			}
				
			else {
				out.print("Error While  Inserting a Data");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
