package com.oldwang;

import com.oldwang.config.OldwangConfig;
import com.oldwang.pojo.Oldwang;
import com.oldwang.pojo.People;
import com.oldwang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class SpringTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        People people = applicationContext.getBean("people", People.class);
        people.getDog().shot();
        people.getCat().shot();
    }

    @Test
    public void testUser(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.name);
    }

    @Test
    public void testConfig(){
       ApplicationContext applicationContext = new AnnotationConfigApplicationContext(OldwangConfig.class);
        Oldwang oldwang = applicationContext.getBean("oldwang2", Oldwang.class);
        System.out.println(oldwang.name);
    }
}
