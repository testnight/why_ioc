package com.test;

import com.test.dao.impl.UserDaoImpl;
import com.test.entity.Person;
import com.test.service.Impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Cyistal
 */
public class Main {

    public static void main(String[] args) {

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.setUserDao(new UserDaoImpl());
        userServiceImpl.getUserService();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("loc.config.xml");
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
