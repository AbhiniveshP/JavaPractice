package com.codewithmosh.oop.mytube;

public class EmailService implements NotificationService{

    @Override
    public void sendEmail(User user){
        System.out.println("Sending e-mail...");
        System.out.println("Done sending\n");
    }
}
