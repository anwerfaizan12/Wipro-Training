package day_10;

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
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","12345@aW");
		  System.out.println("Connection Created successfully");
		  
		  Statement stmt = con.createStatement();
		  String query = "select * from Students order by first_name";
		  ResultSet rs=stmt.executeQuery(query);
		  System.out.println("Students data in ascending order of first_name");
		  while(rs.next()) {
			  System.out.println(
					  rs.getInt(1)+" "+
			          rs.getString(2)+" "+
			          rs.getString(3)+" "+
			          rs.getInt(4)+" "+
			          rs.getString(5)
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
