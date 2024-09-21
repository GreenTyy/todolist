package com.example.todo_list.controller;

import com.example.todo_list.pojo.Task;
import com.example.todo_list.servie.TaskService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin
@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;
    //打印任务内容
    @GetMapping("/taskInfo")
    public ArrayList<String> taskInfo(){
        ArrayList<String> tasks = taskService.getTask();
        return tasks;
    }
    //添加新任务
    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task task) {
        taskService.addTask(task);
        return task;
    }
    //删除任务
    @DeleteMapping("/removeTask")
    public void deleteTask(String task_name) {
        taskService.deleteTask(task_name);
    }
}
