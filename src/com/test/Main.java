package com.test;

import com.test.dao.impl.UserDaoImpl;
import com.test.service.Impl.UserServiceImpl;

/**
 * @author Cyistal
 */
public class Main {

    public static void main(String[] args) {

        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.setUserDao(new UserDaoImpl());
        userServiceImpl.getUserService();
    }
}
