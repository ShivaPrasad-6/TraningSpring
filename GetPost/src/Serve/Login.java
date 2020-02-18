package Serve;

import java.io.*;
import javax.servlet.*;

import javax.servlet.http.*;


/**
 * Servlet implementation class Login
 */
//@WebServlet("/Login")
public class Login extends HttpServlet {
	//private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	          
	    String n=request.getParameter("userName");  
	    String p=request.getParameter("userPass");  
	          
	    if(p.equals("asd"))
	    {  
	        RequestDispatcher rd=request.getRequestDispatcher("servlet2");  
	        rd.forward(request, response);  
	    }  
	    else{  
	        out.print("Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/Index.html");  
	        rd.include(request, response);  
	                      
	        }  
	}

}