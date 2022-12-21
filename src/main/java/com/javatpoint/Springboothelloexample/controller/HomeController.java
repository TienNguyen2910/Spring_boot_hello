package com.javatpoint.Springboothelloexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController

public class HomeController {
    @RequestMapping("/demo")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        return  modelAndView;
    }
    @GetMapping("/quizstart")
    public String quizstart(){
        return "Hello World";
    }
}
