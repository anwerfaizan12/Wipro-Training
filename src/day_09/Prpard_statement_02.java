package day_09;

	
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
	import java.util.Scanner;

	public class Prpard_statement_02 {
		  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	      
			  try {
			  // Step 1- register the driver
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  
	         //Step 2 - Establish the connection
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","12345@aW");
			  System.out.println("Connection established");
			  
			  // create query
			  String query = "insert into student (name,id,address) values(?,?,?)";
			  
			  // get the prepared statement
			  PreparedStatement pstmt = con.prepareStatement(query);
			  
			  // getting input data using scanner
			  Scanner scn = new Scanner(System.in);
			  
			  System.out.println("Enter student name");
			  String name = scn.next();
			  
			  System.out.println("Enter student id");
			  int id = scn.nextInt();
			  
			  System.out.println("Enter student address");
			  String address = scn.next();
			  
			  // set the values to query
			  pstmt.setString(1, name);
			  pstmt.setInt(2, id);
			  pstmt.setString(3,address);
			  
			  pstmt.executeUpdate();
			  System.out.println("Data inserted dynmically");
			  
			  con.close();
			  }
			  catch(ClassNotFoundException e)
			  {
				  System.err.println("Unable to load the driver"+e);
			  }
			  
			  catch (SQLException e)
			  {
				  System.err.println("Can not connect to the database"+e);
			  }    
		  }	  
		}

