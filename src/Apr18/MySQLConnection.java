package Apr18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/dbcsit228f2";
    public static Connection getConnection() {
        Connection c = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(URL);
            System.out.println("DB Connection successful");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;
    }

    public static void main(String[] args) {
        getConnection();
    }
}
