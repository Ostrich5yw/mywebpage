package com.example.mywebpage.dao;

import com.example.mywebpage.bean.UserBean;

public interface UserinformationDao {
    UserBean getInfo(String user_name, String user_password);
    UserBean setInfo(String user_name, String user_password);
}
