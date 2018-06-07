package com.my.controller;

import com.my.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/test")
public class ClientController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "index")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String say(){
        System.out.println("===============");
        return testService.sayHello("success 载入客户1");
    }
}
