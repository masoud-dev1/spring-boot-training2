package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class NotificationManager {

    private Notificationservice notificationservice;

    public NotificationManager(Notificationservice notificationservice){
        this.notificationservice = notificationservice;
        System.out.println("main");
    }

    @PostConstruct
    public void pre(){
        System.out.println("pre pre pre pre pre pre");
    }

    @PreDestroy
    public void des(){
        System.out.println("des des des des des");
    }

    public void sendNotification(){
        notificationservice.sendMessage("message");
    }
}
