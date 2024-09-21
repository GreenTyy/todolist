package com.example.todo_list.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String email;
    private String avatar;
}
