package com.sample.surendraavn.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SampleController {

    @RequestMapping(path = "/redhat/sample", method=RequestMethod.GET)
    public String requestMethodName(@RequestParam String param) {
        return param;
    }
    
}
