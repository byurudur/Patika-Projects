import java.sql.*;

public class Main {
    private Connection connection = null;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public void connection(){
        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost/employees", "root", "mysql");
            System.out.println("Connected");
            System.out.println("-------------------------------------");

        } catch (SQLException e) {
            System.out.println("Connection failed. Please check your steps.");
        }
    }

    public void logIn(String name, int id){
        String info = "SELECT * FROM employee WHERE name = ? AND id = ?";
        try {
            preparedStatement = connection.prepareStatement(info);
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2, id);
            ResultSet data = preparedStatement.executeQuery();
            System.out.println("TABLE OF CONTENTS:");
            System.out.println("-------------------------------------");
            if (data.next()){
                System.out.println("id: " + data.getInt("id"));
                System.out.println("Name: " + data.getString("name"));
                System.out.println("Position: " + data.getString("position"));
                System.out.println("Salary: " + data.getInt("salary") + " $");
                System.out.println("-------------------------------------");
            }
        } catch (SQLException e) {
            System.out.println("Hata oluştu" + e);;
        }
    }

    public void getInfo(){
        String info = "SELECT * FROM employee";
        try {
            statement = connection.createStatement();
            ResultSet data = statement.executeQuery(info);
            while (data.next()){
                System.out.println("id: " + data.getInt("id"));
                System.out.println("Name: " + data.getString("name"));
                System.out.println("Position: " + data.getString("position"));
                System.out.println("Salary: " + data.getInt("salary") + " $");
                System.out.println("-------------------------------------");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args) {
        Main main = new Main();
        main.connection();
        main.getInfo();
    }
}