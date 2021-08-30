package com.nocdy.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Nocdy
 * 配置RestTemplate，用于远程调用服务提供者
 *
 */
@Configuration
@LoadBalancerClient(value = "CLOUD-PAYMENT-SERVICE",configuration = LoadBalancerConfiguration.class)
public class RestTemplateConfiguration {

    /**
     *
     * @return 注入Bean实例
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
