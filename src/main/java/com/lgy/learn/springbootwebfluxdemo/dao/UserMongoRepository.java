package com.lgy.learn.springbootwebfluxdemo.dao;

import com.lgy.learn.springbootwebfluxdemo.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * UserMongoRepository
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/12 10:59
 **/
@Repository
public interface UserMongoRepository extends ReactiveMongoRepository<User, String> {
}
