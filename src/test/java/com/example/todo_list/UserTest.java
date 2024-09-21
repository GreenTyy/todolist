package com.example.todo_list;

import com.example.todo_list.servie.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
public class UserTest {
    @Autowired
    private UserService userService;
    Scanner scanner = new Scanner(System.in);
    //显示用户信息
    @Test
    public void userInfo(){
        System.out.println("请输入用户id");
        Integer id = Integer.parseInt(scanner.nextLine());
        String text = userService.userInfo(id).toString();
        System.out.println(text);
    }
    @Test
    //添加用户
    public void addUser(){
        System.out.println("请输入新用户昵称");
        String newUser_name = scanner.nextLine();
        System.out.println("请输入新用户邮箱地址");
        String newUser_email = scanner.nextLine();
        userService.addUser(newUser_name, newUser_email);
    }
    //更新用户昵称
    @Test
     public void updateName(){
        System.out.println("请输入新昵称：");
        String new_name = scanner.nextLine();
        System.out.println("请输入更新的用户id");
        Integer id = scanner.nextInt();
        userService.updateName(id, new_name);
    }
}
