package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo3Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Demo3Application.class, args);
        var noti = context.getBean(NotificationManager.class);
        noti.sendNotification();
    }

}
