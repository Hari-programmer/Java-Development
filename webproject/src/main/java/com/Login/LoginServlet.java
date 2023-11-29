package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out=response.getWriter();
	
	String un=request.getParameter("uname");
	String pass=request.getParameter("pass");
	
	if(un.equals("Hari") && pass.equals("1234")) {
		out.println("<font color =green><b> Welcome Hari</b></font>");
	}else {
			out.println("<font color =red><b> Invalid Username or Password</b></font>");
	}
	}
	
	}

