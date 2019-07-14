package com.github.zk.eurekafeignclient.remote;

import com.github.zk.eurekafeignclient.configuration.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author zk
 * @Date 2019/7/14 10:37
 */
@FeignClient(value = "eureka-client" , configuration = FeignConfig.class)
public interface RemoteHiMethod {
    @RequestMapping("/hiMethod")
    String remoteHi(@RequestParam("name") String name);
}
