package com.example.mywebpage.serviceimpl;

import com.example.mywebpage.bean.StuBean;
import com.example.mywebpage.dao.StuDao;
import com.example.mywebpage.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuServiceImpl implements StuService {
    @Autowired(required = false)
    StuDao stuDao;

    @Override
    public StuBean Login(String user_name, String user_password) {
        return stuDao.getInfo(user_name, user_password);
    }
}
