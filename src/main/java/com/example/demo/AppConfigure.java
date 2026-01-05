package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigure {

    @Value("${configure}")
    private String name;

    @Bean
    public Notificationservice email(){
        return new EmailNotificationService();
    }
    @Bean
    public Notificationservice sms(){
        return new SMSNotificationService();
    }
    @Bean
    public NotificationManager manage(){
        if(name.equals("paypal")){
            return new NotificationManager(email());
        }else {
            return new NotificationManager(sms());
        }
    }
}
