package com.example.springbootthymeleafdemo.controller;

import com.example.springbootthymeleafdemo.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {
    @GetMapping("/student")
    public String listStudent(Model model){
        List<StudentEntity> st = new ArrayList<>();
        st.add(new StudentEntity(1 , "Sameer","sameer@gmail.com","123"));
        st.add(new StudentEntity(2 , "Sarang","sarang@gmail.com","456"));
        st.add(new StudentEntity(3 , "Vivek","vivek@gmail.com","789"));
        st.add(new StudentEntity(4 , "Rohit","rohit@gmail.com","101"));
        st.add(new StudentEntity(5 , "Dhirendra","dhirendra@gmail.com","112"));
        model.addAttribute("students",st);
        return "student-list";
    }

    @GetMapping("/profile")
    public String showStudentProfile(Model model){
        StudentEntity studentEntity =
                new StudentEntity(1 , "Sameer","sameer@gmail.com","123");
        model.addAttribute("student",studentEntity);
        return "student-profile";

    }
}
