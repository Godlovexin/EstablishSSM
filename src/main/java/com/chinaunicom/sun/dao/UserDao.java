package com.chinaunicom.sun.dao;

import com.chinaunicom.sun.model.Address;
import com.chinaunicom.sun.model.User;

public interface UserDao {

    User selectByPrimaryKey(int userId);
    void insertUser(User user);
void insertAddress(Address address);

}
