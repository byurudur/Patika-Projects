import Core.DataBaseConnection;
import View.LoginUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {

        // Data Access Layer
        // Entity
        // Business
        // View

        DataBaseConnection.getInstance(); // Singleton design pattern
        LoginUI loginUI = new LoginUI();
    }
}
