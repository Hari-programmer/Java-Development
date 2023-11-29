package Database_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class DEMO3 {

	public static void main(String[] args) throws Exception {
	
			Class.forName("com.mysql.cj.jdbc.Driver");  
			    
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");  
			  
			Statement stmt=con.createStatement(); 
			
			String s="create table RRR(id int,Hname varchar(20),HNname varchar(30))";
			//String s1="insert into priya values(2,'ram charan',30000.0f,'yanam')";
		//	stmt.executeUpdate(s1);
			stmt.executeUpdate(s);
			System.out.println("created ");
			stmt.close();
			con.close();
			
			
	
	}

}
