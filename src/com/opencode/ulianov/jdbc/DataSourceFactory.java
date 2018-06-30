package com.opencode.ulianov.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sql.DataSource;

public class DataSourceFactory extends MysqlDataSource{
    private static final String USER= "root";
    private static final String PASSWORD="root";
    private static final String URL="jdbc:mysql://localhost:3306/opencodedb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static DataSource createDataSource(){

        MysqlDataSource mysqlDataSource=null;
        mysqlDataSource= new MysqlDataSource();
        mysqlDataSource.setURL(URL);
        mysqlDataSource.setUser(USER);
        mysqlDataSource.setPassword(PASSWORD);
        return mysqlDataSource;
    }
}
