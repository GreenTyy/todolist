package com.example.todo_list.dao;

import com.example.todo_list.pojo.Schedule;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ScheduleDao {
    //添加当日日程
    @Insert("insert into schedule(program,create_time) values (#{program_name},#{create_time})")
    void addSche(Schedule schedule);
    //添加紧急日程
    @Insert("insert into schedule(program,create_time,end_time) values (#{program_name},#{create_time},#{end_time})")
    void addemSche(Schedule schedule);
    //修改紧急日程
    @Update("update schedule set program=#{program_name}, end_time=#{end_time} where program=#{program_name}")
    void updateemSche(Schedule schedule);
    //删除日程
    @Delete("delete from schedule")
    void deletSche(Schedule schedule);
}
