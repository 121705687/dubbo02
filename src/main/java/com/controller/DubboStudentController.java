package com.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.dubbo1.service.IUserServiceProvider;
import com.model.UserBigInfo;
import com.util.PrintWriterUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/dubbo2")
public class DubboStudentController {
    @Reference
    IUserServiceProvider iUserServiceProvider;//通过jar包引过来的dubbo服务

    //jar包 调 dubbo-底层数据库 ok
    @RequestMapping("/dubbo03")
    public void dubbo03(HttpServletRequest request, HttpServletResponse response){
        List<UserBigInfo> list = iUserServiceProvider.select01();
        PrintWriterUtil.print(response, JSON.toJSONString(list));
    }
}
