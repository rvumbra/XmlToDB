package org.example.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conecta {
    private static String url = "jdbc:mysql://161.35.74.251:3306/VUELOS?allowLoadLocalInfile=true";
    private static String driverName = "com.mysql.cj.jdbc.Driver";
    private static String username = "user_dam_add";
    private static String password = "*21user_dam_server12*";
    private static Connection conn;

    public static Connection conectar() throws ClassNotFoundException, SQLException {
        Class.forName(driverName);
        conn = DriverManager.getConnection(url, username, password);
        System.out.println("Conexión establecida!!!");
        return conn;
    }
}
