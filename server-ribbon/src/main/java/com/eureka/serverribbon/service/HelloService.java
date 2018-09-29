package com.eureka.serverribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/9/29
 * @ Description：
 * @ throws
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String hiService (String name){

        //SERVER-HI:服务注册的名称
        return restTemplate.getForObject("http://SERVER-HI/hi?name="+name, String.class);
    }

}
