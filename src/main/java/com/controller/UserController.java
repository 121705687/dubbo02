package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.dubbo.provide.service.IUserServiceProvider;
import com.model.UserBigInfo;
import com.service.IUserService;
import com.util.PrintWriterUtil;
import com.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    IUserService iUserService;//自己本身的服务

    @Autowired
    RedisUtil redisUtil;//xml中已经注入了

    @RequestMapping("/select01")
    public void select01(HttpServletRequest request, HttpServletResponse response){
        List<UserBigInfo> infoList = iUserService.select01();
        String json = JSON.toJSONString(infoList);
        System.out.println(JSON.toJSONString(infoList));
        PrintWriterUtil.print(response,json);
    }

    //测试redis   ok
    @RequestMapping("/select02")
    public void select02(HttpServletRequest request, HttpServletResponse response){
        List<UserBigInfo> infoList = null;
        if(redisUtil.get("select02")==null){//将数据放入缓存
            infoList = iUserService.select01();
            redisUtil.set("select02",infoList);
            redisUtil.set("select022",JSON.toJSONString(infoList));//如果存成json串，在redis控制台容易看数据接口
        }else{//直接从缓存中获取
            infoList = (List<UserBigInfo>)redisUtil.get("select02");
        }
        String json = JSON.toJSONString(infoList);
        System.out.println(JSON.toJSONString(infoList));
        PrintWriterUtil.print(response,json);
    }
}
