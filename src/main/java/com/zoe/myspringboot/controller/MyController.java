package com.zoe.myspringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MyController {

    @Value("${auther.name}")
    private String name;
    @Value("${auther.work}")
    private String work;


    @Resource//也可以用@autowire  ioc容器自动注入匹配的bean
    private autherConfig auther;

    @RequestMapping("out")
    @ResponseBody
    public String out(){
        System.err.println("1-"+name+work);
        System.err.println("2-"+auther.getCsdnurl());
        return "hello";
    }



}
