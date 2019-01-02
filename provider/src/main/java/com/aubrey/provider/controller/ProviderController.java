package com.aubrey.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aubrey
 * @create 2019-01-02 14:49
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
