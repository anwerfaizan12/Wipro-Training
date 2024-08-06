package day_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Prg_02 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
		  try {
		  // Step 1- register the driver
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
         //Step 2 - Establish the connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","12345@aW");
		  System.out.println("Connection Created successfully");
		  
		  Statement stmt = con.createStatement();
		  String query = "create table Students(student_id int primary key,first_name varchar(30),last_name varchar(30),age int,major varchar(40))";
		  stmt.executeUpdate(query);
		  System.out.println("Table created successfully");
		  
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
