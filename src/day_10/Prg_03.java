package day_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prg_03 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
		  try {
		  // Step 1- register the driver
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
         //Step 2 - Establish the connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","12345@aW");
		  System.out.println("Connection Created successfully");
		  
		  Statement stmt = con.createStatement();
		  String query = "insert into Students values(1,'Faizan','Anwer',26,'Mathematics'),(2,'Aleena','Umar',25,'Physics'),(3,'Sameera','Khan',19,'Chemistry'),(4,'Iqra','Jamal',26,'Biology'),(5,'Mariya','Shahab',25,'English')";
		  stmt.executeUpdate(query);
		  System.out.println("Students data inserted successfully");
		  
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