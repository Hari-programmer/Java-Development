package Database_Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Database_by_using_Scanner_function {

	public static void main(String[] args) throws InputMismatchException {
		// TODO Auto-generated method stub
    
		
		Scanner sc =new Scanner(System.in);
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");
			PreparedStatement stmt=con.prepareStatement("insert into hostelboys values(?,?,?,?,?,?,?)");
			
			System.out.println("Enter the NO");
			int i1=sc.nextInt();
			
			System.out.println("Enter the new name ");
			String str=sc.next();
			
			System.out.println("Enter the new purpose ");
			String str2=sc.next();
			
			System.out.println("Enter the new age ");
			int i2 =sc.nextInt();
			
			System.out.println("Enter the new Sex ");
			String  str3=sc.next();                         
		
			System.out.println("Enter the new city ");
			String str4=sc.next();
			
			System.out.println("Enter the new Contact ");
			int i3=sc.nextInt();
			
			
			
            //int  No=sc.nextInt(); 
			stmt.setInt(1, i1);
			stmt.setString(2, str);
			stmt.setString(3, str2);
			stmt.setInt(4, i2);
		    stmt.setString(5, str3);
		    stmt.setString(6, str4);
		    stmt.setInt(7, i3);

			int i=stmt.executeUpdate();
			System.out.println(i+" updated");
			
			
		} catch (ClassNotFoundException |SQLException  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

}
