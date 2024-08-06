package day_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prg_04 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
		  try {
		  // Step 1- register the driver
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
         //Step 2 - Establish the connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","12345@aW");
		  System.out.println("Connection established");
		  
		  
		  Statement stmt = con.createStatement();
		  String query1 = "select * from employee";
		  String query2 = "delete from employee  where id =4";
		  
		  
		  stmt.executeUpdate(query2);
		  ResultSet rs = stmt.executeQuery(query1);
		  while(rs.next()) {
			  System.out.println(
					  rs.getInt(1)+" "+
			          rs.getInt(2)+" "+
					  rs.getInt(3)+" "+
			          rs.getString(4)
					  );
		  }
		  
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
