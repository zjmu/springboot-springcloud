package com.springboot.consumerserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author zhoujinmu
 * @title UserController
 * @projectName springboot-springcloud
 * @description TODO
 * @created 2019-10-29 14:01
 **/
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name) {
        String s = restTemplate.getForObject("http://PRIVIDER-TICKET/ticket",String.class);
        return name+"购买了" + s;
    }
}
