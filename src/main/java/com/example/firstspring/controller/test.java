package com.example.firstspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class test {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/test1")
    public String test1() {
        return "index1";
    }

    @GetMapping("/test2")
    public String test2() {
        return "index2";
    }

    @GetMapping("*")
    public String test3() {
        return "/errors/404";
    }
}
