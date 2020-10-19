package com.oldwang.agent.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理对象
    public Object getProxy(){
        Object instance = Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
        return instance;
    }

    //处理代理实例 并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是反射
        seeHouse();
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    public void seeHouse(){
        System.out.println("中介在看房子");
    }

    public void fare(){
        System.out.println("收中介费");
    }
}
