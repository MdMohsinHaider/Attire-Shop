package com.attireshop.dao;

import com.attireshop.connection.ConnectionDB;
import com.attireshop.entity.Shirt;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
