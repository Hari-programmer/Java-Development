package Database_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Display_inputdatabase {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");  
		 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");  
		  
		Statement stmt=con.createStatement();  
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM  hostelboys");
		while (rs.next()) {
		
			int s=rs.getInt("No");
			String s1=rs.getString("name");
			System.out.println(s+" : "+s1);
			System.out.println();
			//System.out.println(s + ":"+" Availble in Data from boys");
		}
		
	}

}
