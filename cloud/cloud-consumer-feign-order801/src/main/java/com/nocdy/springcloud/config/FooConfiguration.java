package com.nocdy.springcloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nocdy
 * @date 2021年 08月30日 19:03:52
 */
@Configuration
public class FooConfiguration {

    /**
     *
     * @return   返回日志级别为full的日志
     */
    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
