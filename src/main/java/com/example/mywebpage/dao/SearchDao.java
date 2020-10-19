package com.example.mywebpage.dao;

import com.example.mywebpage.bean.StuBean;
import com.example.mywebpage.bean.TeaBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;

@Mapper
public interface SearchDao {
    @Select("select * from student where stu_name=#{user_name} and stu_password=#{user_password}")
    StuBean stulogin(String user_name, String user_password);
    @Select("select * from teacher where tea_name=#{user_name} and tea_password=#{user_password}")
    TeaBean tealogin(String user_name, String user_password);
}
