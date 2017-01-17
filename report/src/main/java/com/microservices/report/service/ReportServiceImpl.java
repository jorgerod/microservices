package com.microservices.report.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hystrixError")
    public String getFilms() {
        return restTemplate.getForObject("http://localhost:8081/film", List.class).toString();
    }
    
    public String hystrixError() {
        System.out.println("Errrrrrrrrrrrror");
        return "Errorrrrrrr";
    }

}
