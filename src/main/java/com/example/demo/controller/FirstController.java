package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/test")
    public String first(){
        return "first";
    }

    @GetMapping("/param")
    public String second(@RequestParam("test") String test){
        return test;
    }

}
