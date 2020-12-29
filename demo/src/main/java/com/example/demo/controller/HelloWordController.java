package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.po.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;



@Controller
@RequestMapping("/admin")
public class HelloWordController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session){
        user user=userService.checkUser(username,password);
        if(user != null){
            return "home";
        }
        return "redirect:/admin";
    }

}
