package com.example.inventorymanager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnectionManager {

    private static final String DB_URL = "jdbc:mysql://localhost.3306/inventory_management_system";
    private static final String DB_USER = "your_db_username";
    private static final String DB_PASSWORD = "your_db_password";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);

    }
}
