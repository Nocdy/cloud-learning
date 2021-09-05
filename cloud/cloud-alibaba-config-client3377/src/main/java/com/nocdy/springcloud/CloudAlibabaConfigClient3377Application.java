package com.nocdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudAlibabaConfigClient3377Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaConfigClient3377Application.class, args);
    }

}
