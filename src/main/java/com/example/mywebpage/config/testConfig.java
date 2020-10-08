package com.example.mywebpage.config;

import com.example.mywebpage.bean.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class testConfig {
    @Bean(name = "test")
    public UserBean setUser(){
        UserBean userBean = new UserBean();
        userBean.setUser_id(1);
        userBean.setUser_name("wyw");
        userBean.setUser_password("123");
        userBean.setUser_signinyear("1971-11-24");
        return userBean;
    }
}
