package com.github.zk.eurekafeignclient.controller;

import com.github.zk.eurekafeignclient.remote.RemoteHiMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zk
 * @Date 2019/7/14 10:53
 */
@RestController
public class HiController {
    @Autowired
    private RemoteHiMethod remoteHiMethod;
    @RequestMapping("/hiMethod")
    public String hiMethod(String name) {
        return remoteHiMethod.remoteHi(name);
    }
}
