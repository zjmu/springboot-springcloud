package com.springboot.providerticket.service;

import org.springframework.stereotype.Service;

/**
 * @author zhoujinmu
 * @title TicketService
 * @projectName springboot-springcloud
 * @description TODO
 * @created 2019-10-29 11:20
 **/
@Service
public class TicketService {

    public String say() {
        return "这是一张电影票";
    }
}
