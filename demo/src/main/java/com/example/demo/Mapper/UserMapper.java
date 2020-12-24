package com.example.demo.Mapper;

import com.example.demo.po.user;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from user where id=#{id}")
    user selectById(int id);

}
