package Database_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;

public class Save_Method {
         
	public static void save(int no,String name,String purpose,int age,String sex,String city,int contactno) throws SQLException , InputMismatchException{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");
			PreparedStatement pst=con.prepareStatement("insert into hostelboys values(?,?,?,?,?,?,?)");
			
            PreparedStatement stmt = pst;
			
			stmt.setInt(1, no);
			stmt.setString(2,name);
			stmt.setString(3,purpose);
			stmt.setInt(4, age);
			
		    stmt.setString(5, sex);
		    stmt.setString(6, city);
		    stmt.setInt(7,contactno);

			int i=stmt.executeUpdate();
			System.out.println(i+" updated");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void retrive(int no) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");
			
		Statement st =con.createStatement();
		
		String s="select * from hostelboys where no="+no;
		ResultSet rs= st.executeQuery(s);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		Save_Method.save(12,"priya","housewife",22,"F","Yanam",8658456);
		
		Save_Method.retrive(11);
		
	}

}
