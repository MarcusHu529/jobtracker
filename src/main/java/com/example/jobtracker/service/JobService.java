package com.example.jobtracker.service;

import com.example.jobtracker.JobtrackerApplication;
import java.util.List;

public interface JobService {

    Job createJob(Job job);
    List<Job> getAllJobs();
    Job getJobById(Long id);
}
