package com.test;

import com.test.dao.impl.UserDaoImpl;
import com.test.service.Impl.UserServiceImpl;
import com.test.service.UserService;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.setUserDao(new UserDaoImpl());
        userServiceImpl.getUserService();
    }
}
