package com.lgy.learn.springbootwebfluxdemo.handler;

import com.lgy.learn.springbootwebfluxdemo.dao.userRepository;
import com.lgy.learn.springbootwebfluxdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * userHandler
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/11 17:49
 **/
@Component
public class userHandler {

    private final userRepository repository;

    @Autowired
    public userHandler(userRepository userrepository){
        this.repository = userrepository;
    }

    public Mono<User> findById(String id){
        return Mono.justOrEmpty(repository.findById(id));
    }

    public Mono<String> save(User user){
        return Mono.create(userMonoSink -> userMonoSink.success(repository.save(user)));
    }

    public Mono<String> update(User user){
        return Mono.create(userMonoSink -> userMonoSink.success(repository.updateUser(user)));
    }

    public Mono<String> delete(String id){
        return Mono.create(userMonoSink -> userMonoSink.success(repository.deleteUser(id)));
    }

    public Flux<User> findAll(){
        return Flux.fromIterable(repository.findAll());
    }

}
