package com.project.naebang.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class RestApiController {

    @GetMapping("home")
    public String home(){
        return "<h1> home </h1>";
    }

}
