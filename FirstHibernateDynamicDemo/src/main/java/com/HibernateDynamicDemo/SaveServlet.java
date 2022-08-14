package com.HibernateDynamicDemo;

import java.io.IOException;
import java.io.PrintWriter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
PrintWriter out= resp.getWriter();
		
		SessionFactory factory= HibernatUtils.getSessionFactory();
		Session session= factory.openSession();
		
		
		Transaction tx= session.beginTransaction();
		
		Student s1=new Student("aayu", "aayuj@gmail.com", "aa@123");
		session.save(s1);
		
		tx.commit();
		
		session.close();
		out.print("Data inserted Successfully");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}
