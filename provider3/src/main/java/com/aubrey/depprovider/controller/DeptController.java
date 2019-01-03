package com.aubrey.depprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aubrey
 * @create 2019-01-02 15:27
 */
@RestController
@RequestMapping("/provider")
public class DeptController {
    @RequestMapping("/test")
    public String test(){
        return "dept";
    }
}
