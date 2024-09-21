package com.example.todo_list.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
public interface ThemeDao {
    //修改背景图片
    //修改座右铭
    @Update("update theme set motto=#{motto}")
    void updateMotto(String motto);
}
