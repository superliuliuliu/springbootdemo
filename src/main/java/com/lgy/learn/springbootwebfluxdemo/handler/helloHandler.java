package com.lgy.learn.springbootwebfluxdemo.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * helloHandler
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/11 16:40
 **/
@Component
public class helloHandler {
    public static Mono<ServerResponse> helloWorld(ServerRequest request){
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN).body(BodyInserters.fromObject("hello,world"));
    }
}
