package com.syswin.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsulTest {

    @RequestMapping("hello")
    public String getResult(){
        int a = 1;
        return "hello laoshentest";
    }


}
