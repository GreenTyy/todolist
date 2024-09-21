package com.example.todo_list.dao;

import com.example.todo_list.pojo.Task;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface TaskDao {
    //获取任务名称
    @Select("select task_name from task ")
    ArrayList<String> getTask();
    //添加普通任务
    @Insert("insert into task(task_name,frequence,deadline) values (#{task_name},#{frequence},#{deadline})")
    void insertTask(Task task);
    //删除任务
    @Delete("delete from task where task_name = #{task_name}")
    void deleteTask(String task_name);
}
