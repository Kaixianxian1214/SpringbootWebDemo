package com.example.webdemo.bean;

import lombok.Data;

import java.util.Date;

@Data
public class Person {

    private String userName;
    private Integer age;
    private Date date;
    private Pet pet;
}
