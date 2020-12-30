package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.po.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;



@Controller
@RequestMapping("/admin")
public class HelloWordController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String index() {
        return "admin/index";
    }

    @PostMapping("login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        user user=userService.checkUser(username,password);

        if(user != null){
            user.setPassword(null);
            session.setAttribute("user",user);
            return "/admin/home";
        }
        attributes.addFlashAttribute("message","账号或密码错误");
        return "redirect:/admin";
    }

    @GetMapping("home")
    public String home(){
        return "/admin/home";
    }
}
