package com.example.springbootthymeleafdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    private Integer id;
    private String name;
    private String email;
    private String phone;
}
