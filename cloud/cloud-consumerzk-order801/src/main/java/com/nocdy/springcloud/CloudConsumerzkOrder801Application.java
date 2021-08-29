package com.nocdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudConsumerzkOrder801Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConsumerzkOrder801Application.class, args);
    }

}
