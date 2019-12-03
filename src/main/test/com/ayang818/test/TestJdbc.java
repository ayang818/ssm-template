package com.example.test;

import com.example.ssmThymeleaf.model.User;
import com.example.ssmThymeleaf.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestJdbc {

    @Test
    public void test1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        List<User> userList = userService.list();
        for (User user : userList) {
            System.out.println(user);
        }
        context.close();

    }
}
