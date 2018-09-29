package com.eureka.serverfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ Author     ：jmyang
 * @ Date       ：Created in 2018/9/29
 * @ Description：
 * @ throws
 */
@FeignClient(value = "server-hi" ,fallback = ServiceHiHystric.class)
public interface ServiceHi {

    @RequestMapping("/hi")
    String hello(@RequestParam(value = "name") String name);

}
