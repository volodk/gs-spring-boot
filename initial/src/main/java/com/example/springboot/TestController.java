package com.example.springboot;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Component
public class TestController {

    @PostConstruct
    public void init(){
        Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
            this::testMethod, 5, 5, TimeUnit.SECONDS
        );
    }

    private void testMethod() {
        System.out.println("I am test method");
    }
}
