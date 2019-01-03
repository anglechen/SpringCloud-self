package com.aubrey.configclient2.controller;


import com.aubrey.configclient2.config.TestConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aubrey
 * @create 2019-01-02 16:15
 */
@RestController
public class ConfigController {

    @Autowired
    private TestConfig testConfig;

    /*单独注解属性*/
    @Value(value = "${name:nouser}")
    private String userName;

    @RequestMapping("/hi")
    public String hi(){
        return testConfig.getName() +":" + testConfig.getAge();
    }
}
