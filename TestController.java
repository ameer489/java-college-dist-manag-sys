package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ch.qos.logback.core.model.Model;

@SpringBootApplication
@SuppressWarnings("unused")
@Controller
public class TestController {
    @GetMapping("/test")
    @ResponseBody
    // public String requestMethodName(@RequestParam String param) {
    //     System.out.println("hello world");
    //     return "hii";
    // }
    public String handle(){
        return "this is just for fun";
    }
    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login"; // This looks for login.html in the templates folder
    }
   
}
