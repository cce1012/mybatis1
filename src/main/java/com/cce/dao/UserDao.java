package com.cce.dao;

import com.cce.po.User;

public interface UserDao {
    User findById(int id);
    void add(User user);
    void update(User user);
}
