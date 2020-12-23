package com.example.demo.Mapper;

import com.example.demo.po.user;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    public user selectById(int id);
}
