package com.example.demo.Service;

import com.example.demo.po.user;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface UserService {
    user selectById(int id);

    void Insert(user user);

    void Delete(int id);

    void Update(user user);

    List<user> list();

    user checkUser(String username,String password);
}
