package com.example.webdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AttributeController {

    @GetMapping("/goto")
    public String gotoMapping(HttpServletRequest request){

        request.setAttribute("msg", "successful loading...");
        request.setAttribute("code", "coding...");
        return "forward:/success";     // 转发到 /success请求中
    }

    @GetMapping("/params")
    public String testParams(Map<String, Object> map,
                             Model model,
                             HttpServletRequest request,
                             HttpServletResponse response){
        map.put("map", "map666");
        model.addAttribute("model", "model666");
        request.setAttribute("msg", "request666");

        Cookie cookie = new Cookie("_c1", "c1Cookie");
        response.addCookie(cookie);
        return "forward:/success";      // 转发到/success请求中
    }

    // success请求
    @ResponseBody
    @GetMapping("/success")
    public Map<String, Object> successMapping(@RequestAttribute(value = "msg", required = false) String msg,
                                              @RequestAttribute(value = "code", required = false) String code,
                                              HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();

        Object msg1 = request.getAttribute("msg");
        Object map1 = request.getAttribute("map");
        Object model1 = request.getAttribute("model");

        map.put("msg1", msg1);
        map.put("map1", map1);
        map.put("model1", model1);

        return map;
    }
}
