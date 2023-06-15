package com.example.demo.contriller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
    @GetMapping("/")
    public String helloworld(){
        return "welcome to ahamed home";
    }
}
