package com.example.mywebpage.service;

import com.example.mywebpage.bean.UserBean;

public interface UserinformationService {
    UserBean Login(String user_name, String user_password);
}
