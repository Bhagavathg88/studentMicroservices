package com.spring.microservices.training.service;

import com.spring.microservices.training.configuration.StudentFeeConfiguration;
import com.spring.microservices.training.pojo.StudentFee;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Configuration
@RequiredArgsConstructor
public class StudentFeeService {

    private final WebClient webClient;
    private final StudentFeeConfiguration studentFeeConfiguration;
    public StudentFee postPayment(StudentFee studentFee){

        return webClient.post()
                .uri(studentFeeConfiguration.getStudentFeeUrl())
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(studentFee)
                .retrieve()
                .bodyToMono(StudentFee.class)
                .block();
    }

}
