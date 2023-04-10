package com.example.springboot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TracingAspect {

    @Before("execution(* com.example.springboot.TestController.*(..))")
    public void wrap(){
        System.out.println("Hahahahaha");
    }

}
