package com.example.mywebpage.service;

import com.example.mywebpage.bean.UserBean;

public interface UserService {
    UserBean Login(String user_name, String user_password);
}
