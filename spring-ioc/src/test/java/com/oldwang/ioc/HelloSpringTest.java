package com.oldwang.ioc;

import com.oldwang.pojo.Hello;
import com.oldwang.pojo.User;
import com.oldwang.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringTest {

    @Test
    public void testHello(){
        //获取spring的上下文对象 解析bean.xml文件 生成管理相应的Bean对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //getBean : 参数即为spring配置文件中bean的id .
        Hello bean = (Hello) applicationContext.getBean("hello");
        bean.show();
    }

    @Test
    public void testUserDao(){
        //解析bean.xml文件 生成管理相应的Bean对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        //这里相当于将原来的Service层也IOC了，不需要再在代码中写出调用哪个接口，只需要在配置文件中指明调用的接口即可。
        UserServiceImpl userService = (UserServiceImpl) applicationContext.getBean("userService");
        userService.getUser();

        //以前方式
//        UserService user = new UserServiceImpl();
//        ((UserServiceImpl) user).setUserDao(new OracleUserDaoImpl());
//        user.getUser();
    }
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) applicationContext.getBean("newUser");
        user.show();

    }
}
