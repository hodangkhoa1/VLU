package com.teamseven.vlu.utils;

import java.sql.*;

public class DBUtils {
    
    public static Connection makeConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            String urlDataConnection = "jdbc:sqlserver://localhost;databaseName=VLU";
            
            Connection dataConn = DriverManager.getConnection(urlDataConnection, "sa", Encrypt.decrypt("u+X+On2XQDymkX7xtpuohQ==", "ssshhhhhhhhhhh!!!!"));
            
            return dataConn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
