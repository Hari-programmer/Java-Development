package resultmeta;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.*;

public class RetriveMetaData {

	public static void main(String[] args) throws SQLException {
		
try {
	Class.forName("com.mysql.cj.jbdc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","995957");
	
	String s="select * from city";
	PreparedStatement pst=con.prepareStatement(s);
	ResultSet resultSet=pst.executeQuery();
	
	ResultSetMetaData data=resultSet.getMetaData();
	System.out.println(data.getColumnCount());
	System.out.println(data.getColumnName(3));
	System.out.println(data.getColumnTypeName(3));
	
	
	
	
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
