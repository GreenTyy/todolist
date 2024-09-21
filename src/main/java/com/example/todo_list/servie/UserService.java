package com.example.todo_list.servie;


import com.example.todo_list.pojo.User;

public interface UserService {
    //显示用户信息
    User userInfo(Integer id);
    //注册用户
    void addUser(String username, String email);
    //更新昵称
    void updateName(Integer id, String username);
    //更新头像
    void updateAvatar(String avatar);
}
