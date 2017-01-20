package com.durendong.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by durendong on 2017/1/19.
 */
//使用Controller注解声明是一个控制器
@Controller
public class HelloController {

    //配置URL和方法之间的映射
    @RequestMapping("/index")
    public String Hello() {
        //通过ViewResolver的Bean配置，返回值为index,说明我们的页面放置的路径是/WEB-INF/classes/views/index.jsp
        return "index";
    }
}
