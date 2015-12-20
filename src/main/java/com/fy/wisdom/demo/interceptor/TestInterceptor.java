package com.fy.wisdom.demo.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xmj on 2015/12/17.
 */
public class TestInterceptor implements HandlerInterceptor{

    //返回值：表示是否需要将当前的请求拦截下来
    //返回false，请求将被终止
    //返回true,请求会继续运行
    //参数object表示的是被拦截的请求的目标(controller的实例)
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse,
                             Object o) throws Exception {
        System.out.println("执行了preHandle");
        //对用户是否登录进行验证
//        if(httpServletRequest.getSession().getAttribute("user")==null){
//            //用户没有登录就终止请求返回登录页面
//            httpServletRequest.getRequestDispatcher("/login.jsp").forward(httpServletRequest, httpServletResponse);
//            return false;
//        }
        return true;
    }

    //可以通过参数modelAndView来改变显示的视图，或修改发往视图的数据
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("执行了postHandle");
        //modelAndView.addObject("msg","被拦截后的数据");
        //modelAndView.setViewName("/hello2.jsp");
    }

    //在视图已经显示之后执行，主要进行资源的销毁
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("执行了afterCompletion");
    }
}
