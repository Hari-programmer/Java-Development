package com.image;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Store_image {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.cj.jbdc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/hari","root","995957");  
			              
			PreparedStatement ps=con.prepareStatement("insert into images values(?,?)");  
			ps.setString(1,"hari");  
			  
			FileInputStream fin=new FileInputStream("D://hari.jpg");  
			ps.setBinaryStream(2,fin,fin.available());  
			int i=ps.executeUpdate();  
			
			System.out.println(i+" records created"); 
			con.close();  
			
			}catch (Exception e){
				e.printStackTrace();
				}  
			}  

	}


