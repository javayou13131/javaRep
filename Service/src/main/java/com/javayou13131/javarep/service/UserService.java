package com.javayou13131.javarep.service;

import com.javayou13131.javarep.dao.UserMapper;

import javax.annotation.Resource;

/**
 * Created by wangcan10 on 2017/7/28.
 */
public class UserService {
    @Resource
    private UserMapper userMapper;

    public boolean isUserMatch(String userName,String pwd){
        //userMapper.selectByPrimaryKey();
        return false;
    }
}
