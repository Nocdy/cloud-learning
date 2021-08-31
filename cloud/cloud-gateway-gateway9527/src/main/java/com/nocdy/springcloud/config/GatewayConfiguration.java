package com.nocdy.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Nocdy
 * @date 2021年 08月31日 11:08:24
 */
@Configuration
public class GatewayConfiguration {

    /**
     *
     * @param routeLocatorBuilder 路由构造器
     * @return
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes= routeLocatorBuilder.routes();
        //参数说明: id, "/guonei"路径映射到"http://news.baidu.com/guonei",为函数型接口
        //相当于配置yml中id,predicate,uri
        routes.route("path_route_nocdy",
                r->r.path("/guonei").uri("http://news.baidu.com/guonei"));
        return  routes.build();
    }

}
