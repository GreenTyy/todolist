package com.example.todo_list.servie.Impl;

import com.example.todo_list.dao.UserDao;
import com.example.todo_list.pojo.User;
import com.example.todo_list.servie.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User userInfo(Integer id){
       User userInfo = userDao.userInfo(id);
       return userInfo;
    }
    @Override
    public void addUser(String username, String email) {
        User new_user = new User();
        new_user.setUsername(username);
        new_user.setEmail(email);
        userDao.insert(new_user);
    }

    @Override
    public void updateName(Integer id, String username) {
        userDao.update(id, username);

    }

    @Override
    public void updateAvatar(String avatar) {

    }
}
