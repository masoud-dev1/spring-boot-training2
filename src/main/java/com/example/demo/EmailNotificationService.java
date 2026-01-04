package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotificationService implements Notificationservice{
    @Override
    public void sendMessage(String message){
        System.out.println("EMAIL : " + message);
    }
}
