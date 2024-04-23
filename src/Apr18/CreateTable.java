package Apr18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        // try-with-resources block
        try (Connection c = MySQLConnection.getConnection();
             PreparedStatement statement = c.prepareStatement(
                     "CREATE TABLE IF NOT EXISTS users (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(50) NOT NULL," +
                     "email VARCHAR(100) NOT NULL," +
                     "password VARCHAR(50) )")) {
            statement.execute();
            // error
            System.out.println("TABLE created successfully");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
