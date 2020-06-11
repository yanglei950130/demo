package com.example.bbb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("aaa")
    public String getAAA(){
        return "aaa";
    }
}
