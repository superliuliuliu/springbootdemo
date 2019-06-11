package com.lgy.learn.springbootwebfluxdemo.handler;

import com.lgy.learn.springbootwebfluxdemo.dao.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

}
