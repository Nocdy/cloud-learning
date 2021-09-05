package com.nocdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConsumerOrder803Application {


    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConsumerOrder803Application.class, args);
    }


}
