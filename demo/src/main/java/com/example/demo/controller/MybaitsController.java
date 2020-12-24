package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.po.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
