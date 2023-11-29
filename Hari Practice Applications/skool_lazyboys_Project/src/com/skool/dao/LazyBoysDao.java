package com.skool.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.skool.dto.LazyBoys;

public class LazyBoysDao {
	static{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  Connection getConnection() throws SQLException  {
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/skool_lazyboys","root","995957");
		
		return connection;
		
	}
	
	public LazyBoys save(LazyBoys lazyboys) throws SQLException {
		Connection connection=getConnection();
		String sql="insert into lazyboys values(?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		
		preparedStatement.setInt(1,lazyboys.getId());
		preparedStatement.setString(2,lazyboys.getName());
		preparedStatement.setDouble(3,lazyboys.getEnglish());
		preparedStatement.setDouble(4,lazyboys.getMaths());
		preparedStatement.setDouble(5,lazyboys.getScience());
		preparedStatement.setDouble(6,lazyboys.getResult());
		preparedStatement.setDouble(7,lazyboys.getPercentage());
		preparedStatement.setString(8,lazyboys.getGrade());
		
		int i=preparedStatement.executeUpdate();
		return lazyboys;
			
	}
	

}
