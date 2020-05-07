package com.restapi.restservice.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController2 {

    @GetMapping("/")
    public String andrew() {
        return "Andrew is cool";
    }

}
