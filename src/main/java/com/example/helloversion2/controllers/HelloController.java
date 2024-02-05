package com.example.helloversion2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {


    //localhost:8080/hello
    //endpoint handler metode
    @GetMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> sayHello2() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);

    }
    /*@GetMapping("/vis")
    public String showHTMLpage() {
        return "show";
    }
     */
}
