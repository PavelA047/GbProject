package hw_4;

import java.sql.*;

public class JDBCPostgreSQLExample {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/movie";
    static final String USER = "user";
    static final String PASS = "pass";
    private static Connection connection;
    private static PreparedStatement statement;

    static {
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] argv) throws SQLException {
        
    }
}
