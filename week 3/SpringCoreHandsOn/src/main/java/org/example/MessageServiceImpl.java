package org.example;

import org.springframework.stereotype.Component;

@Component
public class MessageServiceImpl implements MessageService {

    @Override
    public void sendMessage() {
        System.out.println("Hello from Spring Core!");
    }
}