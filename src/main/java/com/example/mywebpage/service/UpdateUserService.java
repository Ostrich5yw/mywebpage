package com.example.mywebpage.service;

import com.example.mywebpage.bean.UserBean;

public interface UpdateUserService {
    UserBean Update(String user_name, String user_password);
}
