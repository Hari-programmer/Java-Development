package com.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Drive");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() throws SQLException {
		
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/member","root","995957");
		return connection;
		
	}
	
	public String insert(Member member) throws SQLException {
		Connection connection=getConnection();
		String result="Data entered successfully";
		
		String sql="insert into user values(?,?,?,?)";
		PreparedStatement statement=connection.prepareStatement(sql);
		
		statement.setString(1, member.getName());
		statement.setString(2, member.getPass());
		statement.setString(3, member.getEmail());
		statement.setString(4, member.getPhone());
		
		statement.executeUpdate();
		
		result="Data not entered";
		System.out.println("succussfully data entered");
		return result;
		
		
		
	}

}
