package com.qj.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Insertion {
	
	
	public static void save() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Drive");
			Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957" );
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	public static void main(String[] args)  {
		
	}

}
