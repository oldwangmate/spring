package com.oldwang.pojo;

public class User {

    private String userName;

    public User(String userName) {
        this.userName = userName;
        System.out.println("User 的有参构造");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void show(){
        System.out.println(userName);
    }
}
