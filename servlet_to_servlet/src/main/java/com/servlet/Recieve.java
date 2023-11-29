package com.servlet;
 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Recieve")
public class Recieve extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter writer=res.getWriter();
		int  i=	Integer.parseInt( req.getParameter("id"));
		String s1=req.getParameter("name");
		int  i1=Integer.parseInt( req.getParameter("marks"));
		
		req.getAttribute("h-id");
		req.getAttribute("name");
		
		
		writer.println("<h1>"+"HELLO"+"<h1>"+i+" "+s1+" "+i1);
		System.out.println("successfully......");
	
	}
	

}
