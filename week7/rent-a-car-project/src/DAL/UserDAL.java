package DAL;

import Core.DataBaseConnection;
import Entities.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAL {
    private final Connection conn;

    public UserDAL(){
        this.conn = DataBaseConnection.getInstance();
    }


    public ArrayList<User> findAll(){
        ArrayList<User> userArrayList = new ArrayList<>();
        String sQL = "SELECT * FROM public.user";
        try {
            ResultSet resultSet = this.conn.createStatement().executeQuery(sQL);
            while (resultSet.next()){
                userArrayList.add(this.match(resultSet));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    };



    public User findByLogin(String userName, String passWord){
        User object = null;
        String query = "SELECT * FROM public.user_data WHERE user_name = ? AND user_password = ?";
        try {
            PreparedStatement preparedStatement = this.conn.prepareStatement(query);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2,passWord);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                object = this.match(resultSet);
            }
        } catch (SQLException e) {
            System.out.println("Connection error on the SQL:" + e.getMessage());
        }
        return object;
    }
    public User match(ResultSet resultSet) throws SQLException {
        User object = new User();
        object.setUser_id(resultSet.getInt("user_id"));
        object.setUser_name(resultSet.getString("user_name"));
        object.setUser_password(resultSet.getString("user_password"));
        object.setUser_role((resultSet.getString("user_role")));
        return  object;
    }

}
