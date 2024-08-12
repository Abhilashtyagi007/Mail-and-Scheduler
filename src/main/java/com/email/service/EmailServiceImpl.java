package com.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Value("$(spring.mail.username)")
    private String fromEmailId;


    @Override
    public void sendMail(String recipient, String body, String subject) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(fromEmailId);
        mail.setTo(recipient);
        mail.setSubject(subject);
        mail.setText(body);
        javaMailSender.send(mail);
    }
}
