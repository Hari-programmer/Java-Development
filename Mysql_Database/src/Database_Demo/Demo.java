package Database_Demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;  

public class Demo {
	 
		public static void main(String args[]) throws  Exception{   // IF WE USE SUPER EXCEPTION WE DID NOT USE SUB OF THESE SQLException, ClassNotFoundException, IOException 
		Class.forName("com.mysql.cj.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");  
		  
		System.out.println("Connection created");
	
		Statement stmt=con.createStatement(); 
		
		System.out.println("Statement created");
		
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the table name :-");
		String name=b.readLine();
		
		
		//create table structure 
		String s="create table"+name+ "(ENO int(4),ENAME varchar2(20),ESex char(1),ELOC varchar2(30))";
		String s1="insert into "+ name +"values(1,'Ramcharan','M','Hyderabad')" ;
		//String s2="select *from priya";
		
		stmt.execute(s);
		stmt.executeUpdate(s1);
		//stmt.executeQuery(s2);
		  System.out.println(name+"table created Successfully");
		  
		  stmt.close();
		  con.close();
		}
		

	}


