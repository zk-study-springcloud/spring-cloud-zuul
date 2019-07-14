package com.github.com.eurekaribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author zk
 * @Date 2019/7/14 9:40
 */
@RestController
public class HiController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("hiMethod")
    public String hiMethod(String name) {
        return restTemplate.getForObject("http://eureka-client/hiMethod?name=" + name, String.class);
    }
}
