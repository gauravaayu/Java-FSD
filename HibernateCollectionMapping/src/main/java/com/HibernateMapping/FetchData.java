package com.HibernateMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.SessionFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/FetchData")
public class FetchData extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		
		SessionFactory factory= HibernateUtil.getSessionFactory();
		
		Session session=factory.openSession();
		
		List<EProduct> list= session.createQuery("from EProduct").list();
		
		for(EProduct product:list) {
			out.print("<br>");
			out.print("<b>Id:</b>"+product.getID()+"<br>");
			out.print("<b>Name:</b>"+product.getName()+"<br>");
			out.print("<b>Price:</b> "+product.getPrice()+"<br>");
			out.print("<b>Available from:</b> "+product.getDateAdded()+"<br>");
			
			out.print("<b>Color Details:</b><br>");
			
			List<Color> colors=product.getColors();
			
			for(Color c:colors) {
				out.print("<b>Color Name: </b>"+c.getName()+"<br>");
				
			}
			
			out.print("<b>ScreenSize Details:</b><br> ");
			
			Collection<ScreenSize> screen=product.getScreensizes();
			
			for(ScreenSize sc:screen) {
				out.print("<b>Size: </b>"+sc.getSize()+"<br>");
			}
			
			
			
			out.print("<b><br>OS Details: <br></b>");
			
			Set<Os>os=product.getOs();
			for(Os o:os) {
				out.print("<b>OS: </b><br>"+o.getName());
			}
			
			out.print("<b>Finance Deatils:</b><br>");
			
			Map finance= product.getFinance();
			
			if(finance.get("CREDITCARD")!=null) {
				Finance f=(Finance) finance.get("CREDITCARD");
				f.getName();
			}
			if(finance.get("BANK")!=null) {
				Finance f=(Finance) finance.get("BANK");
				f.getName();
			}
			
			 
			out.print("<br>-----------------------------------------------------------<br>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
