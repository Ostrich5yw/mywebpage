package com.example.mywebpage.dao;

import com.example.mywebpage.MywebpageApplicationTests;
import com.example.mywebpage.bean.UserBean;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest extends MywebpageApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void getAll() {
        List<UserBean> list = userDao.getAll();
        for (UserBean u:list) {
            System.out.println(u);
        }
    }
    @Test
    void getInfo() {
        UserBean u= userDao.getInfo("Ostrich5yw", "123");
        System.out.println(u);
    }
    @Test
    void getUserById() {
        UserBean u= userDao.getUserById(2);
        System.out.println(u);
    }
    @Test
    public void findByPage(){
        //执行分页
        PageHelper.startPage(1,5);
        //执行查询
        List<UserBean> list = userDao.getAll();
        //封装PageInfo对象
        PageInfo<UserBean> pageinfo = new PageInfo<>(list);
        //输出
        for (UserBean userBean : pageinfo.getList()) {
            System.out.println(userBean);
        }
    }
}