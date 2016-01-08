package com.fy.wisdom.mongo.controller;

import com.fy.wisdom.mongo.Service.UserInfoService;
import com.fy.wisdom.mongo.entity.UserInfo;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by ltzm01 on 2015/12/28.
 * mongodb测试controller
 */
@Controller
@RequestMapping("user")
public class UserInfoController {

    private static Logger log = LoggerFactory.getLogger(UserInfoController.class);
    @Resource
    private UserInfoService userInfoService;

    /**
     * 跳转到保存页面
     * user/tosave
     * @return
     */
    @RequestMapping(value = "/toSave",method = RequestMethod.GET)
    public String toSave(){
        return "mongo/save";
    }

    /**
     * 保存
     * @param userInfo
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String test(@ModelAttribute UserInfo userInfo){
        //接收页面参数，保存
        userInfoService.saveUserInfo(userInfo);
        //userInfoService.saveUserInfo(new UserInfo("her塔塔1",23));
        //输出打印
        System.out.println(userInfo.toString());
        log.debug(ReflectionToStringBuilder.toString(userInfo));

        //会重复提交
        //return "hello";
        return "redirect:list";
    }

    /**
     * 跳转到列表页面
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ModelAndView toList(){
        ModelAndView modelAndView = new ModelAndView("mongo/list");
        modelAndView.addObject("users", userInfoService.findAll() );
        return modelAndView;
        //return "mongo/list";
    }
}
