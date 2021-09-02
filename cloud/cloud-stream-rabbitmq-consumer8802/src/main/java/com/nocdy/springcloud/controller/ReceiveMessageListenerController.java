package com.nocdy.springcloud.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Function;

/**
 * @author Nocdy
 * @date 2021年 09月01日 13:33:31
 */
@RestController
public class ReceiveMessageListenerController {


    @Bean
    public Function<String,String> input(){
        return value->{
            String uv=value.toUpperCase();
            System.out.println(uv);
            return  uv;
        };
    }




}
