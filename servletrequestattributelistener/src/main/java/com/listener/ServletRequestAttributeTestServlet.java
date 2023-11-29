package com.listener;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestAttributeTestServlet extends HttpServlet {


	public void init() {
		System.out.println("......");
		System.out.println("init method is called in"+this.getClass().getName());
	System.out.println("................");
	}
	
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
		sleep();
		request.setAttribute("CompanyName","IBM");
		sleep();
		request.setAttribute("CompanyName","Wipro");
		sleep();
		request.removeAttribute("CompanyName");
		}
	private void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void destroy() {
		System.out.println("......");
		System.out.println("Destroy method is called in"+this.getClass().getName());;
	System.out.println("................");
		
	}
	
}
