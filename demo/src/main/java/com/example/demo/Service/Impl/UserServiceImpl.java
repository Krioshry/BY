package com.example.demo.Service.Impl;

import com.example.demo.Mapper.UserMapper;
import com.example.demo.Service.UserService;
import com.example.demo.po.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public user selectById(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public void Insert(user user) {
        userMapper.insert(user);
    }

    @Override
    public void Delete(int id) {
        userMapper.delete(id);
    }

    @Override
    public void Update(user user) {
        userMapper.update(user);
    }

    @Override
    public List<user> list() {
        List<user> users=userMapper.list();
        return users;
    }

}
