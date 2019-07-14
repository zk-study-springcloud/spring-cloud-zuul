package com.github.zk.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zk
 * @Date 2019/7/14 9:33
 */
@RestController
public class Hicontroller {
    @Value("${server.port}")
    private int port;
    @RequestMapping("/hiMethod")
    public String hiMethod(String name) {
        return "hi~" + name + ",I`m " + port;
    }
}
