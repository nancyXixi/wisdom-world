package com.fy.wisdom.mongo.controller;

import com.fy.wisdom.mongo.Service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by ltzm01 on 2015/12/28.
 */
@Controller
@RequestMapping("user")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String test(){
        userInfoService.saveUserInfo();
        return "hello";
    }
}
