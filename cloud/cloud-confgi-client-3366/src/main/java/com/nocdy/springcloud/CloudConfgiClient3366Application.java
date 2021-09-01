package com.nocdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudConfgiClient3366Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudConfgiClient3366Application.class, args);
    }

}
