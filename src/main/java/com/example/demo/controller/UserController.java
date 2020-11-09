package com.example.demo.controller;

import com.example.demo.entity.MyUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

//    @GetMapping("/")
//    public String test(){
//        String msg="111";
//        return "success";
//    }

    @GetMapping("/user")
    public List<MyUser> getAll(){
        return userService.getAllUser();
    }

}
