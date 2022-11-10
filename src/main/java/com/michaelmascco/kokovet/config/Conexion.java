package com.michaelmascco.kokovet.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    Connection con;

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/kokovet";
            String USER_NAME = "MASTER";
            String PASSWORD = "123456";
            con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            System.out.println("Conexión SQL exitosa!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.err);
            System.out.println("Conexión SQL fallida!");
        }
        return con;

    }
}
