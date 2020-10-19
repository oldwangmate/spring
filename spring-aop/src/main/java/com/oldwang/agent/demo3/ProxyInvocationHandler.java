package com.oldwang.agent.demo3;

import com.oldwang.agent.DynamicProxy.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//我们会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //生成得到代理对象
    public Object getProxy(){
        Object instance = Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
        return instance;
    }

    //处理代理实例 并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理的本质就是反射
        sysoLog(method.getName());
        Object invoke = method.invoke(target, args);
        return invoke;
    }

    public void sysoLog(String message){
        System.out.println("执行了"+message+"方法");
    }
}
