package com.login.repository;

import com.login.dbUtils.Connection;

import java.sql.*;

public class PersonalRepositoryImpl implements PersonalRepository {
    @Override
    public void addPersonal(String name, String login, String password) {
        try (java.sql.Connection connection = DriverManager.getConnection(Connection.url, Connection.user, Connection.password)){
            String sql = "Insert into personal(name, login, password) value (?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, login);
            ps.setString(3, password);
            ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public String searchPersonal(String login, String password) {
        String name = null;
        try (java.sql.Connection connection = DriverManager.getConnection(Connection.url, Connection.user, Connection.password)){
            String sql = "Select * from personal";
            Statement statement = ((java.sql.Connection) connection).createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                if (rs.getString(3).equals(login) && (rs.getString(4).equals(password)))
                {
                    name = rs.getString(2);
                    break;
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return name;
    }
}
