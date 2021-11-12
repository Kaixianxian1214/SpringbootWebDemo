package com.example.webdemo.controller;

import com.example.webdemo.bean.Person;
import com.example.webdemo.bean.Pet;
import lombok.val;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class ResponseController {

    @ResponseBody
    @GetMapping("/test/person")
    public Person getPerson(){

        Person person = new Person();
        person.setAge(12);
        person.setDate(new Date());
        person.setPet(new Pet("miaomiao", 18));
        person.setUserName("zhangSan");
        return person;
    }
}
