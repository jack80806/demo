package com.example.demo.service.impl;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(Integer id) {

        return userMapper.selectUserById(id);
/*        User user = new User();
        user.setId(1);
        user.setUsername("johnny");
        return user;*/
    }
}
