package DemoF;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Filter1 implements Filter {
	
public void destroy() {
		
	}
	
	public void doFilter(ServletRequest  req,ServletResponse res,FilterChain chain ) throws IOException,ServletException
	{
		//method
		String name=req.getParameter("username");
		if(name!=null)
			chain.doFilter(req, res);
		else
			res.getWriter().print("User is not Valid");
	}
	
	public void init (FilterConfig fConfig) throws  ServletException
	{
		
	}
	

}
