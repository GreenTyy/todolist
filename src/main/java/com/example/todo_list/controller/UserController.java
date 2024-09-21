package com.example.todo_list.controller;

import com.example.todo_list.servie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    //获取用户信息
    @GetMapping("/userInfo")
    public void userInfo(Integer id) {
        userService.userInfo(id);
    }

}
