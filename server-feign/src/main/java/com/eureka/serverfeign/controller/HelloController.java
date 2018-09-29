package com.eureka.serverfeign.controller;

import com.eureka.serverfeign.service.ServiceHi;
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
public class HelloController {

    @Autowired
    private ServiceHi serviceHi;

    @RequestMapping("/hi")
    public String helloHi(@RequestParam (name = "name",required=false) String name){

        return serviceHi.hello(name);
    }

}
