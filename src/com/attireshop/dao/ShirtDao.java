package com.attireshop.dao;

import com.attireshop.connection.ConnectionDB;
import com.attireshop.entity.Shirt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShirtDao {

    Connection connection = new ConnectionDB().getConnection();

    public Shirt saveShirtDao(Shirt shirt){
        try {
            String INSERT_SHIRT_QUERY = "INSERT INTO `shirt` (id, brand, price, category, size, color) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement =connection.prepareStatement(INSERT_SHIRT_QUERY);
            preparedStatement.setInt(1,shirt.getId());
            preparedStatement.setString(2,shirt.getBrand());
            preparedStatement.setDouble(3,shirt.getPrice());
            preparedStatement.setString(4,shirt.getCategory());
            preparedStatement.setInt(5,shirt.getSize());
            preparedStatement.setString(6,shirt.getColor());

            int a = preparedStatement.executeUpdate();
            return a !=0 ? shirt: null;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public boolean deleteAdminByIdDao(int shirtId) {
        try {
            String DELETE_SHIRT_QUERY = "delete from shirt where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SHIRT_QUERY);
            preparedStatement.setInt(1,shirtId);
            int a = preparedStatement.executeUpdate();
            return a != 0;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public List<Shirt> getAllShirtDao(){
        try {
            String DISPLAY_SHIRT_QUERY = "select * from shirt";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_SHIRT_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Shirt> shirtList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                double price = resultSet.getDouble("price");
                String category = resultSet.getString("category");
                int size = resultSet.getInt("size");
                String color = resultSet.getString("color");

                Shirt shirt = new Shirt(id,brand,price,category,size,color);
                shirtList.add(shirt);
            }
            return shirtList;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Shirt getShirtByIdDao(int shirtId){
        try {
            String DISPLAY_SINGLE_Shirt_QUERY = "select * from shirt where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_SINGLE_Shirt_QUERY);
            preparedStatement.setInt(1,shirtId);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                double price = resultSet.getDouble("price");
                String category = resultSet.getString("category");
                int size = resultSet.getInt("size");
                String color = resultSet.getString("color");

                return new Shirt(id,brand,price,category,size,color);
            } else return null;
        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public List<Shirt> getShirtByBrandDao(String shirtBrand){
        try {
            String DISPLAY_SINGLE_Shirt_QUERY = "select * from shirt where brand=?";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_SINGLE_Shirt_QUERY);
            preparedStatement.setString(1,shirtBrand);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Shirt> shirtList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                double price = resultSet.getDouble("price");
                String category = resultSet.getString("category");
                int size = resultSet.getInt("size");
                String color = resultSet.getString("color");

                shirtList.add(new Shirt(id,brand,price,category,size,color));
            }
            return shirtList;

        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public List<Shirt> getShirtByCategoryDao(String shirtCategory){
        try {
            String DISPLAY_SINGLE_Shirt_QUERY = "select * from shirt where category=?";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_SINGLE_Shirt_QUERY);
            preparedStatement.setString(1,shirtCategory);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Shirt> shirtList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                double price = resultSet.getDouble("price");
                String category = resultSet.getString("category");
                int size = resultSet.getInt("size");
                String color = resultSet.getString("color");

                shirtList.add(new Shirt(id,brand,price,category,size,color));
            }
            return shirtList;

        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public List<Shirt> getShirtByColorDao(String shirtColor){
        try {
            String DISPLAY_SINGLE_Shirt_QUERY = "select * from shirt where color=?";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_SINGLE_Shirt_QUERY);
            preparedStatement.setString(1,shirtColor);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Shirt> shirtList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                double price = resultSet.getDouble("price");
                String category = resultSet.getString("category");
                int size = resultSet.getInt("size");
                String color = resultSet.getString("color");

                shirtList.add(new Shirt(id,brand,price,category,size,color));
            }
            return shirtList;

        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public List<Shirt> getShirtByMinPriceDao(double shirtMinPrice){
        try {
            String DISPLAY_SINGLE_Shirt_QUERY = "select * from shirt where price>=?";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_SINGLE_Shirt_QUERY);
            preparedStatement.setDouble(1,shirtMinPrice);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Shirt> shirtList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                double price = resultSet.getDouble("price");
                String category = resultSet.getString("category");
                int size = resultSet.getInt("size");
                String color = resultSet.getString("color");

                shirtList.add(new Shirt(id,brand,price,category,size,color));
            }
            return shirtList;

        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public List<Shirt> getShirtByMaxPriceDao(double shirtMaxPrice){
        try {
            String DISPLAY_SINGLE_Shirt_QUERY = "SELECT * FROM shirt WHERE price <= ?";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_SINGLE_Shirt_QUERY);
            preparedStatement.setDouble(1,shirtMaxPrice);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Shirt> shirtList = new ArrayList<>();

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String brand = resultSet.getString("brand");
                double price = resultSet.getDouble("price");
                String category = resultSet.getString("category");
                int size = resultSet.getInt("size");
                String color = resultSet.getString("color");

                shirtList.add(new Shirt(id,brand,price,category,size,color));
            }
            return shirtList;

        }catch (SQLException e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public Shirt updateShirtByIdDao(int shirtId, Shirt shirt){
        try {
            String UPDATE_SHIRT_QUERY = "update shirt set brand=?, price=?, category=?, size=?, color=? where id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SHIRT_QUERY);
            preparedStatement.setInt(6,shirtId);
            preparedStatement.setString(1,shirt.getBrand());
            preparedStatement.setDouble(2,shirt.getPrice());
            preparedStatement.setString(3,shirt.getCategory());
            preparedStatement.setInt(4,shirt.getSize());
            preparedStatement.setString(5,shirt.getColor());

            int a = preparedStatement.executeUpdate();
            return a!=0? shirt:null;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
