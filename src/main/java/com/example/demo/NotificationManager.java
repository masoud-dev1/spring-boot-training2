package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class NotificationManager {

    private Notificationservice notificationservice;

    public NotificationManager(Notificationservice notificationservice){
        this.notificationservice = notificationservice;
    }

    public void sendNotification(){
        notificationservice.sendMessage("message");
    }
}
