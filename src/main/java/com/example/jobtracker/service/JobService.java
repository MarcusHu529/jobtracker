package com.example.jobtracker.service;

import com.example.jobtracker.entity.JobApplication;
import java.util.List;

// Service Interface
public interface JobService {
    // Get a list of All jobs
    List<JobApplication> getAllJobs();

    // Create a job application
    JobApplication createJob(JobApplication JobApplication);

    // Get job by ID
    JobApplication getJobById(Long id);
}
