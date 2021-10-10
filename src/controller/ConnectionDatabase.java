package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author afkda
 */
public class ConnectionDatabase {

    public static String userName = "root";
    public static String PassWord = "";
    public static String url = "jdbc:mysql://localhost:3306/englishlibrary";

    public static Connection cnnDB() {
        Connection cnn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                cnn = DriverManager.getConnection(url, userName, PassWord);
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnn;
    }
}
