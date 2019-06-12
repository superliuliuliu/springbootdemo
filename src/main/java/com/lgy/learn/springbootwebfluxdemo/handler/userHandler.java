package com.lgy.learn.springbootwebfluxdemo.handler;

import com.lgy.learn.springbootwebfluxdemo.dao.UserMongoRepository;
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

    private final UserMongoRepository userMongoRepository;

    @Autowired
    public userHandler(UserMongoRepository userMongoRepository){
        this.userMongoRepository = userMongoRepository;
    }

    public Mono<User> findById(String id){
        return userMongoRepository.findById(id);
    }

    public Mono<User> save(User user){
        return userMongoRepository.save(user);
    }

    public Mono<User> update(User user){
        return userMongoRepository.save(user);
    }

    public Mono<String> delete(String id){
        userMongoRepository.deleteById(id);
        return Mono.create(userMonoSink-> userMonoSink.success(id));
    }

    public Flux<User> findAll(){
        return userMongoRepository.findAll();
    }

}
