package com.email.controller;

import com.email.dto.MailDto;
import com.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/mail")
public class Controller {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendmail")
    public ResponseEntity<?> sendMail(@RequestBody MailDto dto){
        emailService.sendMail(dto.getMailTo(),dto.getBody().getContent(),dto.getSubject());

        return ResponseEntity.ok("Mail sent successfully!");
    }

    @GetMapping("greet")
    public String hello(){
        return "Hello! I am doing great!";
    }
}
