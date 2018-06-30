package com.opencode.ulianov.jdbc;

public class User {
    private String name,eMail,password;
    public User(String name,String eMail,String password){
        this.eMail=eMail;
        this.name=name;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }
}
