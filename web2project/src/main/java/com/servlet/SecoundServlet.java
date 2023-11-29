package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecoundServlet extends HttpServlet {

	public void init() {
		System.out.println("......");
		System.out.println("init method is called in"+this.getClass().getName());;
	System.out.println("................");
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String Company=(String)request.getAttribute("companyName");
		out.print("CompanyName"+Company+"<br>");
		System.out.println("......."+"<br>");
		
		
	Enumeration<String> name=request.getAttributeNames();
	while(name.hasMoreElements()) {
		
	String name1=(String) name.nextElement();
	out.print(name1+":");
	Object value=request.getAttribute(name1);
	out.print(value);
	out.print("<br>");
	
	}
	out.close();
	}
	public void destroy() {
		System.out.println("......");
		System.out.println("Destroy method is called in"+this.getClass().getName());;
	System.out.println("................");
		
	}
	
	
	
	
	
	
	}
	

