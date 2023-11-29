package Database_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Database_By_Using_Scanners_Function {

	public static void main(String[] args) throws SQLException {
	Scanner sc =new Scanner(System.in);
    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");
		PreparedStatement stmt=con.prepareStatement("update hostelboys set sex =? where No =?");
		
		
		System.out.println("Enter the new sex");
		String str=sc.next();
		
		System.out.println("Enter the No ");
		int No=sc.nextInt();
		
		stmt.setString(1, str);
		stmt.setInt(2, No);
		
		int i=stmt.executeUpdate();
		System.out.println(i+" updated");
		
		
	} catch (ClassNotFoundException |SQLException  e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    

	}

}
