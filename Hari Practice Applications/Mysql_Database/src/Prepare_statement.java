import java.sql.*;

public class Prepare_statement {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

       try {
		Class.forName("com.mysql.cj.jbdc.Driver");
	
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","995957");
		PreparedStatement pst=con.prepareStatement("insert into student values(45,shiva,57)");
		int i=pst.executeUpdate();
		System.out.println(i);
		
		
   	} catch (ClassNotFoundException e) {
   		// TODO Auto-generated catch block
   		e.printStackTrace();
   		
   	}
	
	}

}
