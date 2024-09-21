package com.example.todo_list.dao;

import com.example.todo_list.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.Map;

@Mapper
public interface UserDao {
    //显示用户信息
    @Select("select * from user where id=#{id}")
    User userInfo(Integer id);
    //添加用户
    @Insert("insert into user(user_name,email) values (#{username},#{email})")
    void insert(User user);
    //更新昵称
    @Update("update user set user_name=#{username} where id=#{id}")
    void update(@Param("id") Integer id,@Param("user_name") String user_name);
    //更新头像
}
