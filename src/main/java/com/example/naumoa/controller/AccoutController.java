package com.example.naumoa.controller;

import com.example.naumoa.entity.User;
import com.example.naumoa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AccoutController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
       return "login";
    }

    @GetMapping("/migrant_insert")
    public String migrant_insert(){
        return "migrant_insert";
    }

    @PostMapping("/migrant_insert")
    public String migrant_insert(User user){
        userService.save(user);
        return "index";
    }
}
