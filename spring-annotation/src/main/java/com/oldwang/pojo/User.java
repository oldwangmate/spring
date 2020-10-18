package com.oldwang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于  <bean id="user" class="com.oldwang.pojo.User"></bean>
@Component
public class User {

    // 相当于配置文件中 <property name="name" value="oldwang"/>
    @Value("oldwang")
    public String name;
}
