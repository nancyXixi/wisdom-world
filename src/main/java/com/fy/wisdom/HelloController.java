package com.fy.wisdom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by xmj on 2015/12/14.
 * spring mvc 单例测试
 * spring mvc 默认都是单例（singleton）单例模式是spring推荐的配置，它在高并发下能极大的节省资源，提高性能
 * 节省了实例的创建和销毁，有利于提高性能，而ThreadLocal用来保证线程安全性。
 */
@Controller
@RequestMapping("hello")
public class HelloController {
    private static Logger log = LoggerFactory.getLogger(HelloController.class);
    private int i = 1;

    @RequestMapping("mvc")
    public String hello(){
        log.info("hello");
        System.out.println(i);
        i++;
        return "hello";
    }

    /**
     * 测试多线程访问是否堵塞
     * spring mvc 多线程访问是不会阻塞的，没使用锁，没竟争资源，性能好
     * ThreadLocal用来保证线程安全性。
     * hello/sleep?sleep=on
     * @return
     */

    @RequestMapping("sleep")
    public String testSleep(@RequestParam("sleep") String sleepParam) throws InterruptedException {
        if("on".equals(sleepParam)){
            Thread.currentThread().sleep(10000);
        }
        System.out.println(sleepParam);
        return "hello";
    }
}
