package com.durendong.springmvc.controller;

import com.durendong.springmvc.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by durendong on 2017/1/20.
 */
@Controller //声明控制类
@RequestMapping("/anno") //声明映射此类的访问路径是/anno
public class DemoAnnoController {

    //通过produces参数定制返回的response的媒体类型和字符集,如果需要返回json,那么可以写成produces="application/json;charset=UTF-8"
    @RequestMapping(produces = "text/plain;charset=UTF-8")

    public @ResponseBody String index(HttpServletRequest request) {
        return "url:" +request.getRequestURL() + " can access";
    }

    //结合@PathVariable设置路径(value) = /anno/pathvar/XX
    @RequestMapping(value = "/pathvar/{str}",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str,HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access,str = " +str;
    }

    //常规的request参数获取,路径是/anno/requestParam?id=1
    @RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id,HttpServletRequest request) {
        return "url:"+request.getRequestURL()+" can access,id = " +id;
    }

    //也可以把参数设置到对象上,访问路径:/anno/obj?id=1&name=xx
    @RequestMapping(value = "/obj",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String passObj(DemoObj obj,HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access, obj id : " +obj.getId() + " obj name = " + obj.getName();
    }

    //可以映射不同路径到相同的方法,比如/anno/name1和/anno/name2访问的是同一个方法
    @RequestMapping(value = {"/name1","/name2"},produces = "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request) {
        return "url:" + request.getRequestURL() + " can access";
    }


}
