package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.po.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MybaitsController {

    @Autowired
    private UserService userService;

    @RequestMapping("mybatis")
    public user MText(){
        user user=userService.selectById(1);
        if(user != null){
            return user;
        }
        return null;
    }

    @RequestMapping("insert")
    public String insert(user user){
        userService.Insert(user);
        return "插入数据成功:"+user;
    }

    @RequestMapping("delete")
    public String delete(int id){
        userService.Delete(id);
        return "删除数据成功";
    }

    @RequestMapping("update")
    public String update(user user){
        userService.Update(user);
        return "更新数据成功:"+user;
    }

    @RequestMapping("list")
    public List<user> list(){
        return userService.list();
    }
}
