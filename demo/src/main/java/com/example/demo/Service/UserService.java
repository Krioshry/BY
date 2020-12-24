package com.example.demo.Service;

import com.example.demo.po.user;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    user selectById(int id);
}
