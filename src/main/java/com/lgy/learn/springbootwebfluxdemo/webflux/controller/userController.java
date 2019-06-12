package com.lgy.learn.springbootwebfluxdemo.webflux.controller;

import com.lgy.learn.springbootwebfluxdemo.domain.User;
import com.lgy.learn.springbootwebfluxdemo.handler.userHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * userController
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/12 10:25
 **/
@RestController
@RequestMapping(value = "/user")
public class userController {

    @Autowired
    private userHandler userhandler;

    @GetMapping(value = "/find/{id}")
    public Mono<User> getUser(@PathVariable(name = "id") String id){
        return userhandler.findById(id);
    }

    @GetMapping(value = "/list")
    public Flux<User> findall(){
        return userhandler.findAll();
    }

    @PostMapping(value = "/add")
    public Mono<String> add(@RequestBody User user){
        return userhandler.save(user);
    }

    @PostMapping(value = "/update")
    public Mono<String> update(@RequestBody User user){
        return userhandler.update(user);
    }

    @DeleteMapping(value = "/delete/{id}")
    public Mono<String> delete(@PathVariable(name = "id") String id){
        return userhandler.delete(id);
    }

}
