package com.oldwang.pojo;

public class Hello {
  private String userName;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void show(){
        System.out.println("Hello,"+ userName );
    }
}
