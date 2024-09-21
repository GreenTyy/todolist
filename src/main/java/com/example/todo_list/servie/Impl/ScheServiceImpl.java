package com.example.todo_list.servie.Impl;

import com.example.todo_list.dao.ScheduleDao;
import com.example.todo_list.pojo.Schedule;
import com.example.todo_list.servie.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleDao scheduleDao;

    @Override
    public void addSche(Schedule schedule) {
      scheduleDao.addSche(schedule);
    }

    @Override
    public void addemSche(Schedule schedule) {
      scheduleDao.addemSche(schedule);
    }

    @Override
    public void updateSche(Schedule schedule) {
     scheduleDao.updateemSche(schedule);
    }

    @Override
    public void removeSche(Schedule schedule) {
        scheduleDao.deletSche(schedule);
    }
}
