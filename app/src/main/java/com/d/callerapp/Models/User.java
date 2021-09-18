package com.d.callerapp.Models;

public class User {

    public String name,email,password,userid;

    public User(String name, String email, String password, String userid) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userid = userid;
    }
    public User()
    {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
