package com.service.impl;

import com.alibaba.fastjson.JSON;
import com.mapper.UserMapper;
import com.model.UserBigInfo;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired  //可行，能正常使用
//    @Resource(name = "userMapper")//也是可行的
    private UserMapper userMapper;//用户

    public List<UserBigInfo> select01() {
        List<UserBigInfo> infoList = userMapper.select01();
        System.out.println(JSON.toJSONString(infoList));
        return infoList;
    }
}
