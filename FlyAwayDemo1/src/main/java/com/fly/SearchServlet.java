package com.fly;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import com.Flyaway.Search;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SearchServlet extends HttpServlet{
	 @Override
	    public void service (HttpServletRequest req, HttpServletResponse resp) throws IOException {
	        Search.date = req.getParameter("date");
	        Search.source = req.getParameter("source");
	        Search.destination = req.getParameter("destination");
	        Search.persons = Integer.parseInt(req.getParameter("persons"));

	        if (Search.date.equals("")) {
	            PrintWriter out = resp.getWriter();
	            out.println("Please enter a valid date");
	        }
	        else {
	            Search.day = getDay(Search.date);
	            resp.sendRedirect("search-results.jsp");
	        }
	    }

	    public String getDay(String dateInp) {
	        LocalDate dt = LocalDate.parse(dateInp);
	        return dt.getDayOfWeek().toString();
	

}
}
