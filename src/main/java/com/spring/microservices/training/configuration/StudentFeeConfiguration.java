package com.spring.microservices.training.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="student.services")
@Data
public class StudentFeeConfiguration {

    private String studentFeeUrl;

}
