package com.nocdy.springcloud.controller;


import com.nocdy.springcloud.entites.CommonResult;
import com.nocdy.springcloud.entites.Payment;
import com.nocdy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Nocdy
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        boolean result= paymentService.save(payment);
        log.info("*****插入结果: "+result);
        if(result){
            return new CommonResult(200,"插入成功serverPort: "+serverPort,true);
        }
        else {
            return new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment=paymentService.getById(id);
        log.info("*****查询结果: "+payment);

        if(payment!=null){
            return new CommonResult(200,"查询成功,serverPort: "+serverPort,payment);
        }
        else {
            return new CommonResult(444,"没有对应记录，查询ID: "+id,null);
        }
    }


}
