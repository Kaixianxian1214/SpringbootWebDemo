package com.example.webdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @RequestMapping("/hello")
    public String Hello(){
        String s = "Hello, world!";
        return s;
    }

//    @RequestMapping("/index.html")
//    public String index(){
//        return "index Page";
//    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getUser(){
        return "GET";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String postUser(){
        return "POST";
    }

    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public  String deleteUser(){
        return "DELETE";
    }

    @RequestMapping(value = "/user", method =RequestMethod.PUT)
    public String putUser(){
        return "PUT";
    }
}
