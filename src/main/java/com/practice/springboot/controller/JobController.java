package com.practice.springboot.controller;

import com.practice.springboot.entity.Job;
import com.practice.springboot.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("job")
public class JobController {
    @Autowired
    private JobRepository jobRepository;

    @PostMapping("/add")
    private Job addJob(Job job) {
        return jobRepository.save(job);
    }
}

//瞎修改