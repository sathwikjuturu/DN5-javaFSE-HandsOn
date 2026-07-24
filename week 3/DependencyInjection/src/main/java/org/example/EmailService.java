package org.example;

import org.springframework.stereotype.Component;


public class EmailService implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Email Sent Successfully");
    }
}