package com.spring.microservices.training.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class StudentServiceConfig {

    @Bean
    WebClient webClient(){
        return WebClient.builder().baseUrl("http://localhost:8083/").build();
    }

}
