package DAL;

import Core.DataBaseConnection;
import Entities.Brand;
import Entities.User;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BrandDAL {
    private final Connection conn;

    public BrandDAL() {
        this.conn = DataBaseConnection.getInstance();
    }
    public ArrayList<Brand> findAll(){
        ArrayList<Brand> brandList = new ArrayList<>();
        String sQL = "SELECT * FROM public.brand ORDER BY brand_id ASC";
        try {
            ResultSet resultSet = this.conn.createStatement().executeQuery(sQL);
            while (resultSet.next()){
                brandList.add(this.match(resultSet));

            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return brandList;
    }

    public Brand match(ResultSet resultSet) throws SQLException {
        Brand object = new Brand();
        object.setBrand_id(resultSet.getInt("brand_id"));
        object.setBrand_name(resultSet.getString("brand_name"));
        return object;
    }
    public boolean save(Brand brand){
        String query = "INSERT INTO public.brand (brand_name) VALUES (?)";
        try {
            PreparedStatement preparedStatement = this.conn.prepareStatement(query);
            preparedStatement.setString(1, brand.getBrand_name());
            return preparedStatement.executeUpdate() != -1;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
    public boolean update(Brand brand){
        String query = "UPDATE public.brand SET brand_name = ? WHERE brand_id = ? ";
        try {
            PreparedStatement preparedStatement = this.conn.prepareStatement(query);
            preparedStatement.setString(1, brand.getBrand_name());
            preparedStatement.setInt(2, brand.getBrand_id());
            return preparedStatement.executeUpdate() != -1;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }

    public Brand getById(int id){
        Brand obj = null;
        String query = "SELECT * FROM public.brand WHERE brand_id = ? ";
        try {
            PreparedStatement preparedStatement = this.conn.prepareStatement(query);
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()){
                obj = this.match(rs);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return obj;
    }

    public boolean delete(int id){
        String query = "DELETE FROM public.brand WHERE brand_id = ? ";
        try {
            PreparedStatement pr = this.conn.prepareStatement(query);
            pr.setInt(1,id);
            return pr.executeUpdate() != -1;

        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }

}
