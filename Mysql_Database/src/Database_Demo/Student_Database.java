package Database_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student_Database {

	public static void main(String[] args) throws Exception {
	
		
			
			Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","995957");  
			  
			  
			Statement stmt=con.createStatement();  
			
			stmt.executeUpdate("create table student (id int, name varchar(30),age int(2),)");
			
				System.out.println("table is created");
			
			
			stmt.close();
			con.close();
			
			}
		
		
	
}
