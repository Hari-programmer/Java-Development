package Database_Demo;
import java.sql.*;
public class demo2 {

	public static void main(String args[]){  
	try{  
	
	Class.forName("com.mysql.cj.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","995957");  
	  
	Statement stmt=con.createStatement();  
	
	String s="create table santh (ENO int (3) primary key,ENAME varchar(20),ESAL float(15),ELOC varchar(30))";
	  stmt.executeUpdate(s);
	  System.out.println("table created Successfully");
	  
	ResultSet rs=stmt.executeQuery("select * from emp");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	  
	 
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  

