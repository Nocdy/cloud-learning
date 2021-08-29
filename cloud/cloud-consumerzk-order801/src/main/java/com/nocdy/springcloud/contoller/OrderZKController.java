package com.nocdy.springcloud.contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * 支付服务控制器
 *
 * @author Nocdy
 * @date 2021年 08月29日 19:44:49
 */
@RestController
@Slf4j
public class OrderZKController {

    /**
     * cloud-provider-payment为服务供着的注册服务名
     */
    public static final String INVOKE_URL = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/zk")
    public String paymentInfo(){

        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk",String.class);
        return result;
    }

}
