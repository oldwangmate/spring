package com.oldwang.agent.DynamicProxy;

public class Client {
    public static void main(String[] args) {
        //真是角色
        Host host = new Host();
        //代理角色 现在没有
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        //通过调用程序处理角色 来处理我们要调用的接口对象
        proxyInvocationHandler.setRent(host);
        Rent proxy = (Rent) proxyInvocationHandler.getProxy(); //这里的proxy就是动态生成的，我们并没有写
        proxy.rent();

    }
}
