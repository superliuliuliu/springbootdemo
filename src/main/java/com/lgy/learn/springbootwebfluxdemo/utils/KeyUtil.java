package com.lgy.learn.springbootwebfluxdemo.utils;

import java.util.Random;
import java.util.UUID;

/**
 * KeyUtil
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/11 17:28
 **/
public class KeyUtil {

    private KeyUtil(){
        throw new IllegalStateException("Utility class");
    }

    //以当前的毫秒数与随机数  同时因为是获取唯一id因此要防止多线程下时间相同
    public static synchronized String getUniqueKey(){
        Integer number = new Random().nextInt(900000) + 100000;
        return  System.currentTimeMillis() + String.valueOf(number) ;
    }

    //生成唯一的UUID
    public static synchronized String getUUID(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
