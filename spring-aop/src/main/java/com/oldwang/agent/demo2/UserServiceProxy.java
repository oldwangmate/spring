package com.oldwang.agent.demo2;

public class UserServiceProxy implements UserService {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void add() {
        printLog("add");
        userService.add();
    }

    public void delete() {
        printLog("delete");
        userService.delete();
    }

    public void update() {
        printLog("update");
        userService.update();
    }

    public void select() {
        printLog("select");
        userService.select();
    }

    //日志方法
    public void printLog(String message){
        System.out.println(message);
    }
}
