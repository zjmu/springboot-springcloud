package com.springboot.providerticket.controller;

import com.springboot.providerticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoujinmu
 * @title TicketController
 * @projectName springboot-springcloud
 * @description TODO
 * @created 2019-10-29 11:22
 **/
@RestController
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping("/ticket")
    public String get() {
        System.out.println("8003");
        return ticketService.say();
    }
}
