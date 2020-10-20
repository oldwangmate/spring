package com.oldwang.aop.annotation_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

//使用注解aop
@Aspect //表示这是一个切面类
public class DiyAnnotation {

    @Pointcut("execution(* com.oldwang.aop.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("======方法执行前=======");
    }
    @After("execution(* com.oldwang.aop.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("======方法执行后=======");
    }

    //在环绕增强中，我们可以给地暖管一个参数，代表我们要获取切入的点
    @Around("execution(* com.oldwang.aop.service.UserServiceImpl.*(..))")
    public void arrount(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("环绕前");
        Signature signature = jp.getSignature();
        String name = signature.getName();
        System.out.println("环绕后" + name);
    }
}
