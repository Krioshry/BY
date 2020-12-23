package com.example.demo.Service.Impl;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.Service.UserService;
import com.example.demo.po.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public user selectById(int id) {
        return userMapper.selectById(id);
    }
}
