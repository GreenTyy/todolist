package com.example.todo_list.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private String program_name;
    private Date create_time;
    private Date end_time;
}
