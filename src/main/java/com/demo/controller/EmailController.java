package com.demo.controller;

import com.demo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/mail")
public class EmailController {
    @Autowired
    private EmailService emailService;


    @GetMapping("/send")
    public String sendMail() {
        try {
            emailService.sendMail("ajpatel7096@gmail.com", "demo", "hello");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "hello";

    }
}
