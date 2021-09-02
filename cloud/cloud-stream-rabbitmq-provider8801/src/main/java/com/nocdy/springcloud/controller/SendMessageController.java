package com.nocdy.springcloud.controller;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Nocdy
 * @date 2021年 09月01日 12:31:08
 */
@RestController
public class SendMessageController {

    @Resource
    private StreamBridge streamBridge;

    @GetMapping(value = "/sendMessage")
    public void sendMessage(@RequestParam("msg") String msg){

        //参数是binding的名字，倘若配置yml中没有此binding，会自动创建一个
        streamBridge.send("output-out-0",msg);
        streamBridge.send("binding-out-0",msg);
    }

}
