package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Student {

    public Student() {
        System.out.println("Student Bean Created");
    }
}