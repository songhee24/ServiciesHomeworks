package com.ServiciesHomeworks.dao;

import com.ServiciesHomeworks.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUser {
    /*--------------- get users ------------------*/
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        String SQL = "select * from users";
        try(Connection conn = DbConnection.connect();
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(SQL)){
            while (resultSet.next()){
                User user = new User();
                  user.setName(resultSet.getString("name"));
                  user.setId(resultSet.getInt("id"));
                  users.add(user);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*--------------- get user by id ------------------*/
    public User getUserById(int id) throws SQLException {
        String SQL = "update * from user where id = ?";
        User user = new User();
        try(Connection connection = DbConnection.connect();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(1,id);
          try (ResultSet resultSet = preparedStatement.executeQuery() ) {
               if (resultSet.next()){
                  user.setName(resultSet.getString("name"));
                  user.setPassword(resultSet.getString("password"));
               }
               return user;
          } catch (SQLException e) {
              e.printStackTrace();
          }
            return null;
        }

    }

    /*--------------- update user ------------------*/
    public User updateUserById(int id,String name,String password) throws SQLException {
        String SQL = "select user set name = ?, password = ? where id = ?";
        User user = new User();
        try(Connection connection = DbConnection.connect();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(3,id);
            preparedStatement.setString(1,name);
            preparedStatement.setString(1,password);
            try (ResultSet resultSet = preparedStatement.executeQuery() ) {
                if (resultSet.next()){
                    user.setName(resultSet.getString("name"));
                    user.setPassword(resultSet.getString("password"));
                }
                return user;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    /*--------------- delete user ------------------*/
         public User deleteUserById(int id,String name,String password) throws SQLException {
        String SQL = "delete from user name = ?, password = ? where id = ?";
        User user = new User();
        try(Connection connection = DbConnection.connect();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(3,id);
            preparedStatement.setString(1,name);
            preparedStatement.setString(1,password);
            try (ResultSet resultSet = preparedStatement.executeQuery() ) {
                if (resultSet.next()){
                    user.setName(resultSet.getString("name"));
                    user.setPassword(resultSet.getString("password"));
                }
                return user;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
