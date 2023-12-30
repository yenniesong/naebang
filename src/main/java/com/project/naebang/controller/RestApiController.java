package com.project.naebang.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class RestApiController {

    @GetMapping({"", "/"})
    public String index(){
        return "index";
    }

}
