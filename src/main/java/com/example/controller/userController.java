package com.example.controller;

import com.example.pojo.User;
import com.example.service.userService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("user")
public class userController {
    @Autowired
    private userService userService;

    @GetMapping("hello")
    public String login(){
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("login");
        System.out.println("hello method is running");
        return "hello";
    }

    @GetMapping("{id}")
    public User queryById(@PathVariable("id") long id){
        return userService.selectById(id);
    }
}
