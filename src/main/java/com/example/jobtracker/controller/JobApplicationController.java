package com.example.jobtracker.controller;

import com.example.jobtracker.entity.JobApplication;
import com.example.jobtracker.repository.JobApplicationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {

    private final JobApplicationRepository repository;

    public JobApplicationController(JobApplicationRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public JobApplication create(@RequestBody JobApplication job) {
        return repository.save(job);
    }

    @GetMapping
    public List<JobApplication> getAll() {
        return repository.findAll();
    }
}

