package util;
import java.sql.*;
public class DBConnection{
    public static Connection getConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/banking_management_system";
        String username = "root";
        String password = "FarukMySql@3002";
        return
                DriverManager.getConnection(url, username, password);
    }
}
