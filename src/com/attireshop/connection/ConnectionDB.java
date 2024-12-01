package com.attireshop.connection;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    // Connection to the SQL Databases.
    public static Connection getConnection() throws SQLException {
        // Step: 1
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        // Step: 2
        String url= "jdbc:mysql://localhost:3306/DB_Name";
        String user_name = "USERNAME";
        String passwordString = "User_PASSWORD";
        return DriverManager.getConnection(url,user_name,passwordString);

    }
}