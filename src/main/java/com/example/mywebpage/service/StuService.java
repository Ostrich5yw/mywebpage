package com.example.mywebpage.service;

import com.example.mywebpage.bean.StuBean;

public interface StuService {
    StuBean Login(String user_name, String user_password);
}
