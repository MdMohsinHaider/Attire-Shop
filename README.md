# Attire-Shop
The Cloth Services project aims to streamline and manage all clothing and accessory inventories in a store or shop.
This repository is designed to cater to stores dealing with diverse clothing brands and types,
ensuring efficient tracking, categorization, and sales management.

# Attire-ShopConnection Module

This module provides a utility to establish a connection to a MySQL database using JDBC.It defines a `ConnectionDB` class with a static method `getConnection()` for database connectivity.

---

## 📋 Features
- **Database Connectivity:** Handles the setup for connecting to a MySQL database.
- **Encapsulation:** Provides a reusable static method to simplify connection handling.

---

## 🛠️ Prerequisites
Before using this module, ensure you have:
- **Java Development Kit (JDK)** 8 or later installed.
- **MySQL Database** configured and running with the schema named `DB_NAME`
- **MySQL Connector/J** library included in your project's classpath.

---

## ⚙️ Configuration
The database connection parameters are:
- **Database URL:** `jdbc:mysql://localhost:3306/DB_NAME`
- **Username:** `USER_NAME_HERE`
- **Password:** `USER_PASSWORD_HERE`

Feel free to modify these parameters inside the `ConnectionDB` class as needed.

---

## 🏗️ Code Overview

### `ConnectionDB.java`

```java
package com.attireshop.connection;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    // Method to establish a connection to the SQL database.
    public static Connection getConnection() throws SQLException {
        // Step 1: Register the MySQL driver
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);

        // Step 2: Define database connection parameters
        String url = "jdbc:mysql://localhost:3306/DB_NAME;
        String user_name = "root_DEFULT;
        String passwordString = "USER_PASSWORD";

        // Step 3: Return the connection object
        return DriverManager.getConnection(url, user_name, passwordString);
    }
}


```
