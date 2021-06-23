package com.syswin.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulTest {

    @RequestMapping("hello")
    public String getResult(){
        int b = 2;
        int c= 3;
        return "hello laoshentest";
    }


}
