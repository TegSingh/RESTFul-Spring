package com.example.RestSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // Similar to app.route in flask. The following method will be used when the URL
    // is /helloworld
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }

}
