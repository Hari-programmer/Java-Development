package com.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/shm")


public class Hello1  extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		
		PrintWriter printWriter=response.getWriter();
	                          System.out.println("Server name :"+request.getServerName());
	                          System.out.println("Server Port :"+request.getServerPort());
	                          System.out.println("Servlet path:"+request.getServletPath());
	                          
	                          System.out.println(request.getAttribute("courses"));
	//	JspWriter.getServerPort
		
		
		printWriter.println("By Using Array concept ::");
		
		String[] s=request.getParameterValues("courses");
		
		System.out.println();
		
	    printWriter.println("You have Selected These courses:");
	
	    for(int i=0;i<s.length;i++) {
	    	printWriter.println("You Con Learn This Cources :"+" "+s[i]);
	    	
	    	
	    }
	 
	
	}
	
	

}
