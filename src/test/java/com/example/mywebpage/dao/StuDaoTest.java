package com.example.mywebpage.dao;

import com.example.mywebpage.MywebpageApplicationTests;
import com.example.mywebpage.bean.StuBean;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


class StuDaoTest extends MywebpageApplicationTests {
    @Autowired
    private StuDao stuDao;

    @Test
    void getAll() {
        List<StuBean> list = stuDao.getAll();
        for (StuBean u:list) {
            System.out.println(u);
        }
    }
    @Test
    void getInfo() {
        StuBean u= stuDao.getInfo("Ostrich5yw", "123");
        System.out.println(u);
    }
    @Test
    void getUserById() {
        StuBean u= stuDao.getUserById(2);
        System.out.println(u);
    }
    @Test
    public void findByPage(){
        //执行分页
        PageHelper.startPage(1,5);
        //执行查询
        List<StuBean> list = stuDao.getAll();
        //封装PageInfo对象
        PageInfo<StuBean> pageinfo = new PageInfo<>(list);
        //输出
        for (StuBean userBean : pageinfo.getList()) {
            System.out.println(userBean);
        }
    }
}