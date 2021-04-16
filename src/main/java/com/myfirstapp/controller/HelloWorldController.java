package com.myfirstapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Hello")
public class HelloWorldController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "Hello World!!!!";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name){
        return "Hello "+name+" !";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "hello "+name+" !";
    }
}
