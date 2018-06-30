package com.opencode.ulianov.jdbc;

import java.sql.*;

public class JDBCDataManager {
    Connection conn = null;
    PreparedStatement preparedStatement =null;
    ResultSet rs = null;
    String query;
    public void getConnection(){
        try{
            conn=DataSourceFactory.createDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void addUser(User user) throws SQLException {
        preparedStatement=conn.prepareStatement("INSERT INTO users(name,email,password) VALUES (?,?,?);");
        preparedStatement.setString(1,user.getName());
        preparedStatement.setString(2,user.geteMail());
        preparedStatement.setString(3,user.getPassword());
        preparedStatement.execute();
    }
    public boolean findUser(String eMail,String password){
        return true;
    }
    public void addAttempts(String eMail,String password) {

    }
}
