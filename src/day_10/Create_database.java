package day_10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_database {
    public static void main(String[] args) {
        try {
            // Step 1- register the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2 - Establish the connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "12345@aW");
            System.out.println("Connection created successfully");

            // Step 3 - Create a statement
            Statement stmt = con.createStatement();

            // Step 4 - Create the database
            String sqlDB = "db3"; // Set your database name here
            String sql = "CREATE DATABASE " + sqlDB;
            stmt.executeUpdate(sql);
            System.out.println("Database created successfully");

            // Step 5 - Close the connection
            con.close();
        } catch (ClassNotFoundException e) {
            System.err.println("Unable to load the driver: " + e);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e);
        }
    }
}
