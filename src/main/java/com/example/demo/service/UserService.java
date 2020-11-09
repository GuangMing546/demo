package com.example.demo.service;

import com.example.demo.entity.MyUser;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public List<MyUser> getAllUser(){
        return userMapper.getAllUser();
    }
}
