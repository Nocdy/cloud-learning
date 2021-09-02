package com.nocdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author Nocdy
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CloudStreamRabbitmqProvider8801Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudStreamRabbitmqProvider8801Application.class, args);
    }


    /**
     * 名字与通道要一致
     * @return
     */
/*    @Bean
    public Supplier<String> output(){
        return ()->{
            String serial = UUID.randomUUID().toString();
            return  serial;
        };
    }*/


}
