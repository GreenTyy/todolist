package com.example.todo_list;

import com.example.todo_list.servie.AppenceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Scanner;

@SpringBootTest
public class AppenceTest {
    @Autowired
    private AppenceService appenceService;
    Scanner scanner = new Scanner(System.in);
    @Test
    public void setMotto() {
        System.out.println("请输入motto");
        String motto = scanner.nextLine();
        appenceService.setMotto(motto);
    }
}
