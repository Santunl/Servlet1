package com.pratice;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.*;
import javax.servlet.http.*;
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>Welcome to RegisterServlet</h2>");
		
		String name=request.getParameter("user_name");
		String password1=request.getParameter("user_password");
		String email=request.getParameter("user_email");
		String gender=request.getParameter("user_gender");
		String course=request.getParameter("user_course");
		String cond=request.getParameter("condition");
		
		if(cond.equals("checked"))
				{
					out.println("<h2>Name:"+name+"</h2>");
					out.println("<h2>Password:"+password1+"</h2>");
					out.println("<h2>email:"+email+"</h2>");
					out.println("<h2>gender:"+gender+"</h2>");
					out.println("<h2>course:"+course+"</h2>");
				}
		else {
			out.println("<h2>Accepct Terms and condition</h2>");
		}
		
		
	}
	

}

