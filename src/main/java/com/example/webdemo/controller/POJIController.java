package com.example.webdemo.controller;

import com.example.webdemo.bean.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class POJIController {

    @PostMapping("/saveuser")
    public Person saveUser(Person person){

        return person;
    }
}
