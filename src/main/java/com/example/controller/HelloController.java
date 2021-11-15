package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hot-fix");
        System.out.println("master 冲突");
        System.out.println("hot-fix 冲突");
        return "hello git";
    }
}
