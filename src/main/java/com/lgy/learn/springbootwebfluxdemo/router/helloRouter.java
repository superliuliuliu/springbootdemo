package com.lgy.learn.springbootwebfluxdemo.router;

import com.lgy.learn.springbootwebfluxdemo.handler.helloHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * helloRouter
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/11 16:43
 **/
@Configuration
public class helloRouter {

    @Bean
    public RouterFunction<ServerResponse> routeHello(){
        return RouterFunctions
                .route(RequestPredicates.GET("/hello").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), helloHandler::helloWorld);
    }

}
