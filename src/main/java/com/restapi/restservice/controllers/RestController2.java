package com.restapi.restservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// = @Controller + @ResponseBody
public class RestController2 {

    @GetMapping("/")
    public String andrew() {
        return "Andrew is cool";
    }

}
