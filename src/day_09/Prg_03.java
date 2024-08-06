package day_09;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prg_03 {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException {
      
		  try {
		  // Step 1- register the driver
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
         //Step 2 - Establish the connection
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2","root","12345@aW");
		  System.out.println("Connection established");
		  
		  Statement stmt = con.createStatement();
		  ResultSet rs = stmt.executeQuery("select * from employee");
		  
		  String name;
		  int id;
		  
		  while(rs.next()) {
			  name = rs.getString("name");
			  id = rs.getInt("id");
			  System.out.println("name - "+name+"  id -  "+id);
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
