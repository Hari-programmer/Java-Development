package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstServlet extends HttpServlet {
	
	public void init() {
		System.out.println("......");
		System.out.println("init method is called in"+this.getClass().getName());;
	System.out.println("................");
	}
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		
		response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	   request.setAttribute("companyName ", "IBM");
	   request.setAttribute("Location","Chennai");
		
	System.out.println("firstservlet will forward the request to Secoundservlet");
	
	
	try {
	
		Thread.sleep(3000);
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	
	
RequestDispatcher dispatcher=request.getRequestDispatcher("/servlet2");
	
dispatcher.forward(request, response);
	out.close();
	
	}
	public void destroy() {
		System.out.println("......");
		System.out.println("Destroy method is called in"+this.getClass().getName());;
	System.out.println("................");
		
	}
	
	
	
	
	}
	
	
	
	
	
	


