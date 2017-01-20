package com.durendong.springmvc.controller;

import com.durendong.springmvc.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by durendong on 2017/1/21.
 */

@RestController //申明该控制器返回数据时候不需要@ResponseBody
@RequestMapping("/rest")
public class DemoRestContrller {

    @RequestMapping(value = "/getjson",produces = "application/json;charset=UTF-8")
    public DemoObj getjson(DemoObj obj) {
        //直接返回对象，对象会自动转换成json
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }

    @RequestMapping(value = "/getxml",produces = "application/xml;charset=UTF-8")
    public DemoObj getxml(DemoObj obj) {
        //直接返回对象，对象会自动转换成xml
        return new DemoObj(obj.getId()+1,obj.getName()+"yy");
    }
}
