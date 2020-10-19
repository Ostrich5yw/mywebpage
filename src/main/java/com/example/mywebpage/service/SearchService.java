package com.example.mywebpage.service;

import com.example.mywebpage.bean.StuBean;
import com.example.mywebpage.bean.TeaBean;
import org.springframework.context.annotation.Bean;

public interface SearchService {
    public StuBean stulogin(String user_name, String user_password);
    public TeaBean tealogin(String user_name, String user_password);
}
