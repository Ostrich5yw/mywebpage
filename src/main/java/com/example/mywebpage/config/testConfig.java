package com.example.mywebpage.config;

import com.example.mywebpage.bean.StuBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration      //声明当前类是一个配置类
public class testConfig {
    @Bean(name = "testconfig")       //构建一个实例，放入Spring容器中
    public StuBean setUser(){
        StuBean stuBean = new StuBean();
        stuBean.setStu_id(1);
        stuBean.setStu_name("wyw");
        stuBean.setStu_password("123");
        stuBean.setStu_signinyear("1971-11-24");
        return stuBean;
    }
}
