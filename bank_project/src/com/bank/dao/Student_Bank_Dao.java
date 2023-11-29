package com.bank.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bank.dto.Student_Bank;

public class Student_Bank_Dao {
	
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_of_student","root","995957");
		
		
	}
	
	public Student_Bank  save(Student_Bank  student ) throws SQLException {
		
         Connection connection=getConnection();
          
         String sql="insert into student_account values(?,?,?,?,?,?,?)";
         PreparedStatement pStatement=connection.prepareStatement(sql);
         pStatement.setInt(1, student.getSno());
         pStatement.setString(2, student.getHolderName());
         pStatement.setInt(3, student.getAccNo());
         pStatement.setDouble(4, student.getBalance());
         pStatement.setInt(5, student.getPenalty());
         pStatement.setString(6,student.getPenaltyStatus());
         pStatement.setDouble(7, student.getTaotalbal());
         
       int  i= pStatement.executeUpdate(sql);
	   return student;	
	}


}
