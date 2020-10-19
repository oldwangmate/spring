package com.oldwang.agent.demo3;

import com.oldwang.agent.demo2.UserService;
import com.oldwang.agent.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(); //真实角色

        //代理角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //设置要代理的对象
        proxyInvocationHandler.setTarget(userService);
        //动态生成代理类
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
    }
}
