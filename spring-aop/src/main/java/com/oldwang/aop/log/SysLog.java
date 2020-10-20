package com.oldwang.aop.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SysLog implements MethodBeforeAdvice {
    /**
     *
     * @param method  要执行的方法
     * @param objects 参数
     * @param target 目标对象
     * @throws Throwable
     */
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被执行了");
    }
}
