package com.example.todo_list.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Integer task_id;
    private String task_name;
    private Integer frequence;
    private Date deadline;
}
