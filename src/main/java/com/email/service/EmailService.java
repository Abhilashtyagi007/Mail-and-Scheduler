package com.email.service;

public interface EmailService {

    void sendMail(String recipient, String body, String subject);
}
