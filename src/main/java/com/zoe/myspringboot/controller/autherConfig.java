package com.zoe.myspringboot.controller;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: zoe
 * @Date: 2020/8/25 16:40
 * @Description:自定义配置文件封装bean
 */
@Component //这是一个组件类。加这个注解，启动时会自动注入
@ConfigurationProperties(prefix = "auther")//将auther开头的属性自动赋值给对应的bean
public class autherConfig {
     private String  name ;
     private String  sex;
     private String work;
     private String hoppy;
     private String website;
     private Boolean hasCsdn;
     private String csdnurl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getHoppy() {
        return hoppy;
    }

    public void setHoppy(String hoppy) {
        this.hoppy = hoppy;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Boolean getHasCsdn() {
        return hasCsdn;
    }

    public void setHasCsdn(Boolean hasCsdn) {
        this.hasCsdn = hasCsdn;
    }

    public String getCsdnurl() {
        return csdnurl;
    }

    public void setCsdnurl(String csdnurl) {
        this.csdnurl = csdnurl;
    }
}
