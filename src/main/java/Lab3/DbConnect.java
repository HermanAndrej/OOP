package Lab3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/CHANGE";
    private static final String USERNAME = "CHANGE";
    private static final String PASSWORD = "CHANGE";


    public DbConnect() {
        try {
            Connection connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
