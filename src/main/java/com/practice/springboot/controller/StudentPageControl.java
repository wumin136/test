package com.practice.springboot.controller;

import com.practice.springboot.entity.Student;
import com.practice.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("web")
public class StudentPageControl {
    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    public String getAllStu(Model model)
    {
        List<Student> lists = studentService.getAllStudent();
        model.addAttribute("stus", lists);
        return "index";
    }

    @GetMapping("/update/{id}")
    public String update_Show(Model model, @PathVariable("id") Integer stuID)
    {
        Student tmp = studentService.getStudentByID(stuID);
        model.addAttribute("stu",tmp);
        model.addAttribute("cap","修改学生信息");
        return "update";
    }

    @PostMapping("/update/{id}")
    public String update_Submit(Model model, @PathVariable("id") Integer stuID, @ModelAttribute Student stu)
    {
        stu.setStuID(stuID);
        studentService.updateStudent(stu);
        model.addAttribute("stu",stu);
        //return getAllStu(model);
        return "result";
    }

    @GetMapping("/add")
    public String add_Show(Model model)
    {
        model.addAttribute("stu",new Student());
        model.addAttribute("cap","添加新的学生");
        return "update";
    }

    @PostMapping("/add")
    public String add_Submit(Model model, @ModelAttribute Student stu)
    {
        Student newStudent = new Student();
        newStudent.setStuPhone(stu.getStuPhone());
        newStudent.setStuName(stu.getStuName());
        newStudent.setStuAddress(stu.getStuAddress());
        studentService.addStudent(newStudent);
        model.addAttribute("stu",newStudent);
        //return getAllStu(model);
        return "result";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(Model model, @PathVariable("id") Integer stuID)
    {
        studentService.deleteStudent(stuID);
        return "delSuc";
    }
}
