package com.attireshop.dao.imp;

import com.attireshop.connection.ConnectionDB;
import com.attireshop.dao.AdminsDao;
import com.attireshop.entity.Admins;
import com.attireshop.entity.imp.Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDao implements AdminsDao {

    Connection connection = new ConnectionDB().getConnection();

    @Override
    public Admins saveAdmin(Admins admin) {
        try {
            String INSERT_ADMIN_QUERY = "insert into admin(adminID, name, email, password, phone, role) value(?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_ADMIN_QUERY);
            preparedStatement.setString(1,admin.getAdminID());
            preparedStatement.setString(2,admin.getName());
            preparedStatement.setString(3,admin.getEmail());
            preparedStatement.setString(4,admin.getPassword());
            preparedStatement.setString(5,admin.getPhone());
            preparedStatement.setString(6,admin.getRole());
            int a = preparedStatement.executeUpdate();
            return a!=0?admin:new Admin("Save Admin Not Success");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    @Override
    public Admins getAdminById(String adminID) {
        try {
            String GET_SINGLE_ADMIN_QUERY = "select * from admin where adminID=?";
            PreparedStatement preparedStatement = connection.prepareStatement(GET_SINGLE_ADMIN_QUERY);
            preparedStatement.setString(1,adminID);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                String id = resultSet.getString("adminID");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
//                String password = resultSet.getString("password"); // Not fetch dew to privacy reason.
                String phone = resultSet.getString("phone");
                String role = resultSet.getString("role");
                return new Admin(id,name,email,phone,role);
            }
            else return new Admin("Admin Not Found By Admin Id");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Admins getAdminByEmail(String adminEmail) {
        try {
            String GET_SINGLE_ADMIN_QUERY = "select * from admin where email=?";
            PreparedStatement preparedStatement = connection.prepareStatement(GET_SINGLE_ADMIN_QUERY);
            preparedStatement.setString(1,adminEmail);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                String id = resultSet.getString("adminID");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
//                String password = resultSet.getString("password"); // Not fetch dew to privacy reason.
                String phone = resultSet.getString("phone");
                String role = resultSet.getString("role");
                return new Admin(id,name,email,phone,role);
            }
            else return new Admin("Admin Not Found By Admin Email");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<Admins> getAllAdmins() {
        try {
            String DISPLAY_ADMIN_QUERY = "select * from admin";
            PreparedStatement preparedStatement = connection.prepareStatement(DISPLAY_ADMIN_QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Admins> adminList = new ArrayList<>();
            while (resultSet.next()){
                String id = resultSet.getString("adminID");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
//                String password = resultSet.getString("password"); // Not fetch dew to privacy reason.
                String phone = resultSet.getString("phone");
                String role = resultSet.getString("role");
                Admins admin = new Admin(id,name,email,phone,role);
                adminList.add(admin);
            }
            return adminList;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    @Override
    public Admins updateAdmin(String adminID, Admins admin) {
        try {
            String UPDATE_ADMIN_QUERY = "update admin set name=?, email=?, password=?, phone=?, role=? where adminID=?";
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_ADMIN_QUERY);
            preparedStatement.setString(6,adminID);
            preparedStatement.setString(1,admin.getName());
            preparedStatement.setString(2,admin.getEmail());
            preparedStatement.setString(3,admin.getPassword());
            preparedStatement.setString(4,admin.getPhone());
            preparedStatement.setString(5,admin.getRole());
            int a = preparedStatement.executeUpdate();
            return a!=0?admin:new Admin("Admin by user not Successful ");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }


    @Override
    public boolean deleteAdmin(String adminID) {
        try {
            String DELETE_ADMIN_QUERY = "delete from admin where adminID=?";
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_ADMIN_QUERY);
            preparedStatement.setString(1,adminID);
            int a = preparedStatement.executeUpdate();
            return a != 0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
