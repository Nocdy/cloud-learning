package com.nocdy.springcloud.service;

import com.nocdy.springcloud.config.FooConfiguration;
import com.nocdy.springcloud.entites.CommonResult;
import com.nocdy.springcloud.entites.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Feign服务接口
 *
 * @author Nocdy
 * @date 2021年 08月30日 17:30:26
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",configuration = FooConfiguration.class)
public interface PaymentFeignService {

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
