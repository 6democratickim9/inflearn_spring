package com.example.restfulwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // /hello-world (endpoint)
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";

    }
}
