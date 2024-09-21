package com.example.todo_list.servie;

import com.example.todo_list.pojo.Task;

import java.util.ArrayList;

public interface TaskService {
    //获取任务内容
    ArrayList<String> getTask();
    //添加任务
    void addTask(Task task);
    //删除任务
    void deleteTask(String task_name);
}
