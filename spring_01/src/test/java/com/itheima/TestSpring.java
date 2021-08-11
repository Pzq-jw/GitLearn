package com.itheima;

import com.itheima.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    @Test
    public void test01(){
        ClassPathXmlApplicationContext act = new ClassPathXmlApplicationContext("classpath:spring.xml");
        UserService userService = (UserService) act.getBean("userService");
        System.out.println(userService.getName());
    }
}
