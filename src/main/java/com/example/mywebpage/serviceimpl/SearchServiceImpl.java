package com.example.mywebpage.serviceimpl;

import com.example.mywebpage.bean.StuBean;
import com.example.mywebpage.bean.TeaBean;
import com.example.mywebpage.dao.SearchDao;
import com.example.mywebpage.service.SearchService;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SearchServiceImpl implements SearchService {
    @Resource
    private SearchDao searchDao;
    @Override
    public StuBean stulogin(String user_name, String user_password) {
        return searchDao.stulogin(user_name, user_password);
    }
    @Override
    public TeaBean tealogin(String user_name, String user_password) {
        return searchDao.tealogin(user_name, user_password);
    }
}
