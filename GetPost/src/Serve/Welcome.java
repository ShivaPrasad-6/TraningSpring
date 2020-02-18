package Serve;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class Welcome
 */
//@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");  
		    PrintWriter out = response.getWriter();
		    
		    String n=request.getParameter("userName");  
		    out.print("Welcome "+n);  
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
