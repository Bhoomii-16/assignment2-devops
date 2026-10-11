package com.example.assignment2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Assignment 2 DevOps CI/CD Pipeline is running!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
