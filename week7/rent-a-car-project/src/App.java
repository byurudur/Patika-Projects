import Business.UserManager;
import Core.DataBaseConnection;
import Entities.Brand;
import View.AdminUI;
import View.BrandUI;
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

        //DataBaseConnection.getInstance(); // Singleton design pattern
        //LoginUI loginUI = new LoginUI();
        UserManager userManager = new UserManager();

        AdminUI adminUI = new AdminUI(userManager.findByLogin("Kiersten Skally", "fR9>L=W"));
    }
}
