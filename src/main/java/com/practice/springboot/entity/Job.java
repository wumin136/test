package com.practice.springboot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job {
    @Id
    @GeneratedValue
    private Integer ID;
    private String jobTitle;
    private Integer minSalary;
    private Integer maxSalary;

    public Integer getID()
    {
        return ID;
    }
    public String getJobTitle()
    {
        return jobTitle;
    }
    public Integer getMinSalary()
    {
        return minSalary;
    }
    public Integer getMaxSalary()
    {
        return maxSalary;
    }

    public void setId(Integer ID)
    {
        this.ID = ID;
    }
    public void setJobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
    }
    public void setMinSalary(Integer minSalary)
    {
        this.minSalary = minSalary;
    }
    public void setMaxSalary(Integer maxSalary)
    {
        this.maxSalary = maxSalary;
    }
}
