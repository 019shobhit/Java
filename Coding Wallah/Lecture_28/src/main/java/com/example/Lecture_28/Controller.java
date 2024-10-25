package com.example.Lecture_28;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/get")
    public String doGet(){
        return "Hello dosto this is my Spring Web page Get Mapping";
    }

    @PostMapping("/post")
    public String doPost(){
        return "Hello dosto this is my Spring Web page Post Mapping";
    }

}
