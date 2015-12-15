package com.fy.wisdom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xmj on 2015/12/14.
 */
@Controller
@RequestMapping("hello")
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("mvc")
    public String hello(){
        log.info("hello");
        return "hello";
    }
}
