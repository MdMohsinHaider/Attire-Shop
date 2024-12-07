package com.attireshop.connection;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    // Connection to the SQL Databases.
    public  Connection getConnection() {
        try {
            // Step: 1
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            // Step: 2
            String url= "jdbc:mysql://localhost:3306/DB NAME";
            String user_name = "";
            String passwordString = " ";
            return DriverManager.getConnection(url,user_name,passwordString);

        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
}
