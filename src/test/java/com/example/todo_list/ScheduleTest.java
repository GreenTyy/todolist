package com.example.todo_list;

import com.example.todo_list.pojo.Schedule;
import com.example.todo_list.servie.ScheduleService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

@SpringBootTest
public class ScheduleTest {
    @Autowired
    private ScheduleService scheduleService;
    Scanner scanner = new Scanner(System.in);
    Date create_date = new Date();
    @Test
    public void Scheduleadd() throws ParseException {
        System.out.println("请输入当日日程项目");
        String programName = scanner.nextLine();
        System.out.println("请输入日程截止日期");
        String targetDate = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date end_time= sdf.parse(targetDate);
        Schedule schedule = new Schedule(programName,create_date,end_time);
        scheduleService.addemSche(schedule);
    }
    @Test
    public void ScheduleEdit() throws ParseException {
        System.out.println("请修改当日日程项目");
        String new_programName = scanner.nextLine();
        System.out.println("请输入日程截止日期");
        String targetDate = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date end_time= sdf.parse(targetDate);
        Schedule update_schedule = new Schedule();
        update_schedule.setProgram_name(new_programName);
        update_schedule.setEnd_time(end_time);
        scheduleService.updateSche(update_schedule);
    }
}
