

import java.sql.*;

public class Display_inputdatabace1 {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","995957");  
		  
		  
		Statement stmt=con.createStatement();  
		
		ResultSet rs=stmt.executeQuery("SELECT * FROM  RRR");
		while (rs.next()) {
		System.out.println(rs.getInt(1)+""+rs.getInt(1)+""+rs.getInt(1));
		}
		
		
	}

}
