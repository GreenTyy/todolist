package com.example.todo_list.servie.Impl;

import com.example.todo_list.dao.TaskDao;
import com.example.todo_list.pojo.Task;
import com.example.todo_list.servie.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;
    private ArrayList<String> tasks;
;

    @Override
    public ArrayList<String> getTask() {
        tasks = taskDao.getTask();
        return tasks;
    }
    @Override
    public void addTask(Task task) {
        taskDao.insertTask(task);
    }
    @Override
    public void deleteTask(String task_name) {
        taskDao.deleteTask(task_name);
    }
}
