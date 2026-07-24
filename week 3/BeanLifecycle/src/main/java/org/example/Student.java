package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @PostConstruct
    public void init() {
        System.out.println("Bean Initialized");
    }

    public void study() {
        System.out.println("Student is Studying");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean Destroyed");
    }
}