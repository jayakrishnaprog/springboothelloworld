package com.example.helloworld.controller;
import com.example.helloworld.controller.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @PostMapping("/hello")
    public String sendGreetings(@RequestBody PojoModel body) {
        return body.getAbc();
    }
}
