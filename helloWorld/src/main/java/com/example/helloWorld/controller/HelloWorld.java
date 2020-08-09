
package com.example.helloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld 
{
    //private Logger logger = Logger.getLogger(HelloWorld.class);

    @RequestMapping("/hello")
    public String helloWorld(){
        return "Hello World 呵呵";
    }

}