package com.search;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out=response.getWriter();   
		String name=request.getParameter("name");  
	        response.sendRedirect("https://www.google.co.in/"+name);  
	        out.println("success");
	    } 

}
