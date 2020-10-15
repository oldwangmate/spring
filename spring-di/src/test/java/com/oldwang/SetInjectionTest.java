package com.oldwang;

import com.oldwang.pojo.Student;
import com.oldwang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetInjectionTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) applicationContext.getBean("student");
        student.show();

        User userP = (User) applicationContext.getBean("userP");
        System.out.println(userP);

        User userC = (User) applicationContext.getBean("userC");
        System.out.println(userC);
    }
}
