package com.example.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

@Controller
public class AttributeController {

    @GetMapping("/goto")
    public String gotoMapping(HttpServletRequest request){

        request.setAttribute("msg", "successful loading...");
        request.setAttribute("code", "coding...");
        return "forward:/success";     // 转发到 /success请求中
    }

    // success请求
    @ResponseBody
    @GetMapping("/success")
    public Map<String, Object> successMapping(@RequestAttribute("msg") String msg,
                                              @RequestAttribute("code") String code,
                                              HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        map.put("code", request.getAttribute("code"));
        return map;
    }
}
