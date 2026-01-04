package com.example.demo;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotificationService implements Notificationservice{

    @Override
    public void sendMessage(String message){
        System.out.println("SMS : " + message);
    }
}
