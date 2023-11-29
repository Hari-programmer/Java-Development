package com.qj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
    
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","995957");  
			Statement stmt=con.createStatement();  
			
			String s="create table priya1 (ENO int (3) primary key,ENAME varchar(20),ESAL float(15),ELOC varchar(30))";
			  stmt.executeUpdate(s);
			  System.out.println("Employ table created Successfully");
			  
			  ResultSet rs=stmt.executeQuery("select * from emp");  
				while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				  
				//step5 close the connection object  
				con.close();  
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
			}

}
