package com.example.webdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/hello")
    public String Hello(){
        String s = "Hello, world!";
        return s;
    }
}
