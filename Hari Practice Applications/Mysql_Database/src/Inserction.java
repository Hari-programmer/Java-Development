import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Inserction {
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection()  throws SQLException {
		
		try {
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/hari","root","995957");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;


	}
	
	public  void save (BackBencher backBencher) {
		
		try {
			Connection connection =getConnection();
			PreparedStatement statement=connection.prepareStatement("insert into backbencher values(?,?,?,?)");
			statement.setInt(1,backBencher.getId ());
			statement.setString(2,backBencher.getName());
			statement.setInt(3,backBencher.getMarks());
			statement.setString(4,backBencher.getSubject());
			statement.executeUpdate();
			
			if(1>0) {
				System.out.println("Data inserted");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	 
		 public static void retreve() {
			 
			 try {
			 Connection connection=getConnection();
			 PreparedStatement statement =connection .prepareStatement("select * from backbencher");
			 ResultSet resultSet=statement.executeQuery();
			 while (resultSet.next()) {
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+resultSet.getString(4));
			 }	
			}
			 catch (SQLException e) {
				 e.printStackTrace();
			 }	
		 }
		 
		 
		 public void retrieveById(int id) {
			 
			 try {
				 Connection connection=getConnection();
				 PreparedStatement statement =connection .prepareStatement("select * from backbencher where id =?");
				 statement.setInt(1,id);
				 ResultSet resultSet=statement.executeQuery();
				 while (resultSet.next()) {
					 BackBencher b=new BackBencher();
					 b.setId(resultSet.getInt(1));
					 b.setName(resultSet.getString(2));
					 b.setMarks(resultSet.getInt(3));
					 b.setSubject(resultSet.getString(4));
				 }
				 
			 }catch (SQLException e) {
			 e.printStackTrace();
			 
			 }
		 }
		 
		 
		 
		 public static void update(int id,String name,int marks,String subject) {
			 
			 try {
					Connection connection =getConnection();
					PreparedStatement statement=connection.prepareStatement("update  backbencher set name=?, marks=?,subject=? where id =? ");
					statement.setString(1,name);
					statement.setInt(2,marks);
					statement.setString(3,subject);
					statement.setInt(4,id);
					statement.executeUpdate();
					
					int i=statement.executeUpdate();
					if(1>0) {
						System.out.println("Data inserted");
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			 
		 }
		 
		 
	}
		 
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


