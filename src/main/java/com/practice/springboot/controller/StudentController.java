package com.practice.springboot.controller;

import com.practice.springboot.entity.Student;
import com.practice.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /*
    * 修改请求类型：https://blog.csdn.net/qingmengwuhen1/article/details/78716782?utm_source=blogxgwz8
    * */
    //@PostMapping("/add")
    @RequestMapping("/add")
    private Student addStudent(Student stu)
    {
        return studentService.addStudent(stu);
    }

    //@GetMapping("/all")
    @RequestMapping("/all")
    private List<Student> getAllStu()
    {
        return studentService.getAllStudent();
    }

    //@GetMapping("/getbyid/{id}")
    @RequestMapping("/getbyid/{id}")
    private Student getStuByStuID(@PathVariable("id") Integer stuID)
    {
        return studentService.getStudentByID(stuID);
    }

    //@PutMapping("updatestu")
    @RequestMapping("updatestu")
    private Student updateStudent(Student student)
    {
        return studentService.updateStudent(student);
    }

    //@DeleteMapping("/del/{id}")
    @RequestMapping("/del/{id}")
    private void delByID(@PathVariable("id") Integer stuID)
    {
        studentService.deleteStudent(stuID);
    }

}
