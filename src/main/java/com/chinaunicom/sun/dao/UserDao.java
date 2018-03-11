package com.chinaunicom.sun.dao;

import com.chinaunicom.sun.model.User;

public interface UserDao {

    User selectByPrimaryKey(int userId);

}
