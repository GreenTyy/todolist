package com.example.todo_list.servie.Impl;

import com.example.todo_list.dao.ThemeDao;
import com.example.todo_list.servie.AppenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppenceServiceImpl implements AppenceService {
    @Autowired
    private ThemeDao themeDao;
    @Override
    public void setMotto(String motto) {
        themeDao.updateMotto(motto);
    }
}
