package com.oldwang.agent.demo2;

public class Client {

    public static void main(String[] args) {
       UserServiceProxy userServiceProxy = new UserServiceProxy();
       userServiceProxy.setUserService(new UserServiceImpl());
       userServiceProxy.add();
    }
}
