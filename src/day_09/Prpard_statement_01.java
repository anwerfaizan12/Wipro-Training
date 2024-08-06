package day_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Prpard_statement_01 {
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
		  
		  // set the values to query
		  pstmt.setString(1, "Ifra");
		  pstmt.setInt(2, 3);
		  pstmt.setString(3,"Mumbai");
		  
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