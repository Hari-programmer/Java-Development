package com.register;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
	
	
	String uname=request.getParameter("uname");
	String password =request.getParameter("pass");
	String email=request.getParameter("email");
	String phone=request.getParameter("phone");
	

	Member member=new Member(uname,password,email,phone);
	
	RegisterDao dao=new RegisterDao();

	String result;
			try {
				result = dao.insert(member);
				response.getWriter().println(result);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	        

}

}
