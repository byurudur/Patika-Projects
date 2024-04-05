package Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private Connection connection = null;
    private  static DataBaseConnection instance = null;
    private final String URL = "jdbc:postgresql://localhost:5432/rentacar";
    private final String URL_USER_NAME = "postgres";
    private final String URL_PASSWORD = "admin";
    private DataBaseConnection(){
        try {
            this.connection = DriverManager.getConnection(URL, URL_USER_NAME, URL_PASSWORD);
            System.out.println("---Successfully Connected to Database---");
        } catch (SQLException e) {
            System.out.println("Connection to Database has failed: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
    public static Connection getInstance() {
        try {
            if (instance == null || instance.getConnection().isClosed()){
                instance = new DataBaseConnection();
            }
        } catch (SQLException e) {
            System.out.println(" SQL Database Connection has been failed: " + e.getMessage());;
        }
        return instance.getConnection();
    }
}