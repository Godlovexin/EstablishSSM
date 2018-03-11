package com.chinaunicom.sun.service.impl;

import com.chinaunicom.sun.dao.UserDao;
import com.chinaunicom.sun.model.User;
import com.chinaunicom.sun.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);

    }
}
