package com.aubrey.consumer.controller;

import com.aubrey.consumer.config.FailBack;
import com.aubrey.consumer.feign.ConsumerFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author aubrey
 * @create 2019-01-02 14:51
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ConsumerFeign consumerFeign;

    @RequestMapping("/test")
    @HystrixCommand(defaultFallback = "hiError")
    public String test(){
       return restTemplate.getForObject("http://localhost:8001/provider/test", String.class);
    }

    @RequestMapping("/feign")
    public String feign(){
        return consumerFeign.test();
    }

    public String hiError(){
        return "hi error";
    }
}
