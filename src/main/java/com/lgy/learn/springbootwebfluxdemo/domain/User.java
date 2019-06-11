package com.lgy.learn.springbootwebfluxdemo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User
 *
 * @author liugaoyang
 * @version 1.0
 * @description
 * @date 2019/6/11 17:29
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    private String userName;

    private String password;

    private Integer sex;

    private Integer age;

    private String address;
}
