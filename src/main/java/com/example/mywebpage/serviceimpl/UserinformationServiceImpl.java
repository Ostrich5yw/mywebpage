package com.example.mywebpage.serviceimpl;

import com.example.mywebpage.bean.UserBean;
import com.example.mywebpage.dao.UserinformationDao;
import com.example.mywebpage.service.UserinformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserinformationServiceImpl implements UserinformationService {
    @Autowired(required = false)
    UserinformationDao userinformationDao;

    @Override
    public UserBean Login(String user_name, String user_password) {
        return userinformationDao.getInfo(user_name, user_password);
    }
}
