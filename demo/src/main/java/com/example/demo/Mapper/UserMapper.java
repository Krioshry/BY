package com.example.demo.Mapper;

import com.example.demo.po.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where id=#{id}")
    user selectById(int id);

    @Insert("insert into user (id,username,password)values(#{id},#{username},#{password})")
    void insert(user user);

    @Delete("delete from user where id=#{id}")
    void delete(int id);

    @Update("update text set username=#{username},password=#{password} where id=#{id}")
    void update(user user);

    @Select("select * from user")
    List<user> list();
}
