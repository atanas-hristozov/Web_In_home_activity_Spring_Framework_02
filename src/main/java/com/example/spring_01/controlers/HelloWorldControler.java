package com.example.spring_01.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldControler {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
}
