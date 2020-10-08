package com.example.mywebpage.config;

import com.example.mywebpage.bean.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //声明当前类是一个配置类
public class testConfig {
    @Bean      //构建一个实例，放置到Spring容器中
    public UserBean userBean(){
        UserBean userBean = new UserBean();
        userBean.setUser_id(1);
        userBean.setUser_name("wyw");
        userBean.setUser_password("123");
        userBean.setUser_signinyear("1977-11-201");
        return userBean;
    }
}
