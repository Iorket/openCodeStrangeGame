package com.opencode.ulianov.main;

import com.opencode.ulianov.jdbc.JDBCDataManager;
import com.opencode.ulianov.jdbc.User;

import java.sql.SQLException;

public class TestClass {
    public static void main(String args[]) throws SQLException {
        SecretNumber secretNumber=new SecretNumber();
        System.out.println(secretNumber.getRealNumber().toString());
        secretNumber.setExpectedNumber(new int[]{5, 4, 3, 2});
        secretNumber.calculate();
        System.out.println(secretNumber.getScore());
        JDBCDataManager jdbcDataManager= new JDBCDataManager();
        jdbcDataManager.getConnection();
        jdbcDataManager.addUser(new User("moji","fdf","fdfdfs"));
    }
}
