package com.example.boothw_4.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class CentralController {

    @Value("${myapp_data_text}")
    public String data;

    @GetMapping()
    public String hello() {
        return "Hello from app " + data;
    }
}