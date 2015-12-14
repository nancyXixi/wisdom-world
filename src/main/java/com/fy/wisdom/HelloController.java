package com.fy.wisdom;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xmj on 2015/12/14.
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("mvc")
    public String hello(){
        return "hello";
    }
}
