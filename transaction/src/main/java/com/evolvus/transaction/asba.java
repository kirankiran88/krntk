package com.evolvus.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class asba {

	public static class MyJDBCExample {
	    public static void main(String[] args) {
	        // Database connection parameters
	        String url = "jdbc:mysql://localhost:3306/mydatabase";
	        String username = "root";
	        String password = "root";

	        // JDBC code
	        try {
	            // Load the JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish the connection
	            Connection connection = DriverManager.getConnection(url, username, password);

	            // Create a statement
	            Statement statement = connection.createStatement();

	            // Execute a query
	            ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");

	            // Process the results
	            while (resultSet.next()) {
	                // Retrieve data from the result set
	                int id = resultSet.getInt("id");
	                String name = resultSet.getString("name");

	                // Print the data
	                System.out.println("ID: " + id + ", Name: " + name);
	            }

	            // Close the resources
	            resultSet.close();
	            statement.close();
	            connection.close();
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
}

