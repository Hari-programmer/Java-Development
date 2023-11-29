package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Provider.Service;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Redirect")
public class Redirect extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		
		int  i=	Integer.parseInt( req.getParameter("id"));
		String s1=req.getParameter("name");
		
		req.setAttribute("h-id","0001");
		req.setAttribute("name", "hari");
		
	   RequestDispatcher dispatcher=req.getRequestDispatcher("Recieve");
	   dispatcher.forward(req, res);
		
		
	}
	

}
