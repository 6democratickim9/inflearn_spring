package com.example.restfulwebservice.helloworld;//컴파일상 오류가 있는것처럼 보임

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    // /hello-world (endpoint)
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";

    }
    //alt+enter
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }
    @GetMapping(path = "/hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable(value="name") String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
