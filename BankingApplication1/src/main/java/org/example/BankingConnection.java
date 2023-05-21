package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

public class BankingConnection {
        public static Connection connect(){
            String URL = "jdbc:mysql://localhost:3306/mydb1"; // jdbc:mysql://hostname:port/dbname
            String username = "root";
            String password = "b1o2o3k4";
            Connection connection = null;

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection  = DriverManager.getConnection(URL, username, password);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(BankingConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(BankingConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            return connection;


        }
}
