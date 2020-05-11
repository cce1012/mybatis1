package com.cce.mapper;

import com.cce.po.User;

public interface UserMapper {
    User findById(int id);
    void add(User user);
    void update(User user);
}
