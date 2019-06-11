package com.lgy.learn.springbootwebfluxdemo.dao;

import com.lgy.learn.springbootwebfluxdemo.domain.User;
import com.lgy.learn.springbootwebfluxdemo.utils.KeyUtil;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * userRepository
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/11 17:40
 **/
@Repository
public class userRepository {
    private Map<String, User> storage = new ConcurrentHashMap<>();

    public String save(User user){
        String id = KeyUtil.getUUID();
        user.setId(id);
        storage.put(id, user);
        return id;
    }

    public Collection<User> findAll(){
        return storage.values();
    }

    public User findById(String id){
        return storage.get(id);
    }

    public String updateUser(User user){
        storage.put(user.getId(), user);
        return user.getId();
    }

    public String deleteUser(String id){
        storage.remove(id);
        return id;
    }
}
