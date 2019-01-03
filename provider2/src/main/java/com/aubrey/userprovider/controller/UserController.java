package com.aubrey.userprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aubrey
 * @create 2019-01-02 15:26
 */
@RestController
@RequestMapping("/provider")
public class UserController {

        @RequestMapping("/test")
        public String test(){
            return "user";
        }
}
