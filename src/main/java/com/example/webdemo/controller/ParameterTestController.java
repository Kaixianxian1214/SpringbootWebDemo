package com.example.webdemo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ParameterTestController {

    @GetMapping("/car/{id}/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable Map<String, String> _map,
                                      @RequestHeader("User-Agent") String userAgent,
                                      @RequestHeader Map<String, String> allHeaderMap,
                                      @RequestParam("inters") String inters,
                                      @RequestParam Map<String, String> allParamMap,
                                      @CookieValue("_ga") Cookie cookie,
                                      @CookieValue("_ga") String _gaCookie){
        Map<String, Object> map = new HashMap<>();

//        // 获取指定的路径变量
//        map.put("id-default", id);
//        // 获取所有的路径变量
//        map.putAll(_map);

//        // 获取指定名称的请求头
//        map.put("userAgent-default", userAgent);
//        // 获取所有的请求头数据
//        map.putAll(allHeaderMap);

//        // 获取指定请求参数
//        map.put("inters-default", inters);
//        // 获取所有请求参数
//        map.putAll(allParamMap);

//        // 获取指定cookie的值
//        map.put("_ga", _gaCookie);
//        // 获取指定cookie的值
//        map.put("_ga", cookie);
        return map;
    }

    @PostMapping("/save")
    public Map<String, Object> postMethod(@RequestBody String content){

        Map<String, Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    @GetMapping("/boss/{bossId}/{empId}")
    public Map bossMapping(@MatrixVariable(value = "age") Integer bossAge,
                           @MatrixVariable(value = "name", pathVar = "empId")String empName){
        Map<String, Object> map = new HashMap<>();

        map.put("bossAge", bossAge);
        return map;
    }
}
