package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;


@Controller
public class HelloWordController {
    @Autowired
    private DataSource dataSource;
    @RequestMapping("/")
    public String test(){
        System.out.println(dataSource);
        return "index.html";
    }
}
