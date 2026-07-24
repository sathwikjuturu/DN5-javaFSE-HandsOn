package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);

        System.out.println(s1);
        System.out.println(s2);

        context.close();
    }
}