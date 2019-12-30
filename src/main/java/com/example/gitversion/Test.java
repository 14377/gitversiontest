package com.example.gitversion;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("/test")
    public String response(){
        return "success";
    }
    @RequestMapping("/test2")
    public String response2(){
        return "success";
    }

}
