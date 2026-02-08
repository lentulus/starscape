package com.starscape.dataobjects;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DatabaseUtil {
    public static Connection getConnection() throws SQLException {
        String jdbcUrl = "jdbc:h2:C:/Users/les_h/starscape/stardata";
        String user = "sa";
        String password = "";
        return DriverManager.getConnection(jdbcUrl, user, password);
    }
}
