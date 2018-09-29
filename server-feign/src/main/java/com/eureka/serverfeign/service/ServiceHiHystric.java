package com.eureka.serverfeign.service;

import org.springframework.stereotype.Component;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/9/29
 * @ Description：演示熔断器
 * @ throws
 */
@Component
public class ServiceHiHystric implements ServiceHi {
    @Override
    public String hello(String name) {

        return "sorry:"+name;
    }
}
