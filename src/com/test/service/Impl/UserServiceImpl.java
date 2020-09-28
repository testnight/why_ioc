package com.test.service.Impl;

import com.test.dao.UserDao;
import com.test.service.UserService;

/**
 * @author Cyistal
 * @version 1.0
 * @title
 * @date 2020/9/28+15:35
 **/
public class UserServiceImpl implements UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUserService() {
        userDao.getUserDao();
    }
}
