package com.example.mywebpage.dao;

import com.example.mywebpage.bean.UserBean;

public interface UserDao {
    UserBean getInfo(String user_name, String user_password);
}
