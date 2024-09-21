package com.example.todo_list;

import com.example.todo_list.pojo.Task;
import com.example.todo_list.servie.TaskService;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

@SpringBootTest
public class TaskTest {
    @Autowired
    private TaskService taskService;
    Scanner scanner = new Scanner(System.in);
    @Test
    public void getTasks(){
        ArrayList<String> tasks = taskService.getTask();
        System.out.println(tasks.toString());
    }
    @Test
    public void Taskadd() throws ParseException {
        /*
        System.out.println("请输入任务名称");
        String taskName = scanner.nextLine();
        Task task = new Task();
        task.setTask_name(taskName);
        taskService.addTask(task);*/
        /*
        Habit habit = new Habit();
        System.out.println("请输入习惯名称");
        String habitName = scanner.nextLine();
        habit.setTask_name(habitName);
        System.out.println("请输入每周完成量");
        Integer frequence = scanner.nextInt();
        habit.setFrequence(frequence);
        taskService.addHabit(habit);*/
        /*
        Target target = new Target();
        System.out.println("请输入目标名称");
        String targetName = scanner.nextLine();
        System.out.println("请输入截止日期");
        String targetDate = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date deadline = sdf.parse(targetDate);
        target.setTask_name(targetName);
        target.setDeadline(deadline);
        taskService.addTarget(target);*/

    }
    @Test
    public void Taskdelete(){
        System.out.println("请输入要删除的任务编号");
        int id = Integer.parseInt(scanner.nextLine());
        taskService.deleteTask("java");
    }
}
