package com.spring.microservices.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMicroservices {
    public static void main(String[] args) {
        SpringApplication.run(StudentMicroservices.class, args);
        System.out.println("Student Microservice");
    }
}