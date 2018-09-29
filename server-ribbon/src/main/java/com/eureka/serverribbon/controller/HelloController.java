package com.eureka.serverribbon.controller;

import com.eureka.serverribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/9/29
 * @ Description：
 * @ throws
 */
@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hi (@RequestParam("name") String name){

        return helloService.hiService(name);
    }
}
