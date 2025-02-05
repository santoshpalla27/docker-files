import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectionTest {

    public static void main(String[] args) {
        // Fetching the database credentials from environment variables
        String jdbcUrl = System.getenv("JDBC_URL");
        String username = System.getenv("DB_USERNAME");
        String password = System.getenv("DB_PASSWORD");

        Connection connection = null;

        try {
            // Attempt to establish a connection to the database
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            if (connection != null) {
                System.out.println("Connection successful!");
            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            System.out.println("MySQL Connection Failed!");
            e.printStackTrace();
        } finally {
            // Close the connection if it was established
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}