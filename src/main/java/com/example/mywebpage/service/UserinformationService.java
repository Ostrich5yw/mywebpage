package com.example.mywebpage.service;

import com.example.mywebpage.bean.UserinformationBean;

public interface UserinformationService {
    UserinformationBean Login(String user_name, String user_password);
}
