package com.example.jobtracker.service;

import com.example.jobtracker.entity.JobApplication;
import com.example.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService{

    private final JobApplicationRepository repository;

    public JobServiceImpl(JobApplicationRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<JobApplication> getAllJobs() {
        return repository.findAll();
    }

    @Override
    public JobApplication createJob(JobApplication jobApplication) {
        return repository.save(jobApplication);
    }

    @Override
    public JobApplication getJobById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Job not found with id: " + id));
    }

}
