package com.nocdy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Nocdy
 * @date 2021年 08月31日 22:14:51
 */
@RestController
@RefreshScope
public class ConfigClientController{
    @Value("${server.port}")
    private String serverPort;

    @Value("${config.info}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String configInfo(){
        return "serverPort: "+serverPort+"\t\n\n configInfo: "+configInfo;
    }

}