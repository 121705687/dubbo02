package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.provide.service.IUserServiceProvider;
import com.util.PrintWriterUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@Controller   //如果没有打开dubbo服务 会报错的
//@RequestMapping("/dubbo1")
public class Dubbo1Controller {
    @Reference
    IUserServiceProvider iUserServiceProvider;//调用Dubbo暴露的接口

    //自己写的dubbo接口类  ok
    @RequestMapping("/dubbo01")
    public void dubbo01(HttpServletRequest request, HttpServletResponse response){
        String str = "";
        str = iUserServiceProvider.getUser();
        System.out.println("消费者调用："+str);
        PrintWriterUtil.print(response,str);
    }
}
