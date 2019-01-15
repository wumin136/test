package com.practice.springboot.service;

import com.practice.springboot.entity.Student;

import java.util.List;

public interface StudentService {
    // 添加学生信息
    Student addStudent(Student student);
    // 返回所有学生信息
    List<Student> getAllStudent();
    // 修改学生信息
    Student updateStudent(Student student);
    // 删除学生信息
    void deleteStudent(Integer stuID);
    // 查询学生信息
    Student getStudentByID(Integer stuID);
}
