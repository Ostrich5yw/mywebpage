package com.example.mywebpage.serviceimpl;

import com.example.mywebpage.bean.UserBean;
import com.example.mywebpage.dao.UserDao;
import com.example.mywebpage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    UserDao userDao;

    @Override
    public UserBean Login(String user_name, String user_password) {
        return userDao.getInfo(user_name, user_password);
    }
}
