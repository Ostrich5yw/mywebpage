package com.example.mywebpage.serviceimpl;

import com.example.mywebpage.bean.UserBean;
import com.example.mywebpage.dao.UserinformationDao;
import com.example.mywebpage.service.UpdateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UpdateUserServiceImpl implements UpdateUserService {
    @Autowired(required = false)
    UserinformationDao userinformationDao;

    @Override
    public UserBean Update(String user_name, String user_password) {
        return userinformationDao.setInfo(user_name, user_password);
    }
}