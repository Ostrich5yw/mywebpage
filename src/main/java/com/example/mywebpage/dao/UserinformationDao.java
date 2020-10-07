package com.example.mywebpage.dao;

import com.example.mywebpage.bean.UserinformationBean;

public interface UserinformationDao {
    UserinformationBean getInfo(String user_name, String user_password);
}
