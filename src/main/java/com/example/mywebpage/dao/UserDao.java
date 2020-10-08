package com.example.mywebpage.dao;

import com.example.mywebpage.bean.UserBean;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import java.util.List;


public interface UserDao {
    UserBean getInfo(String user_name, String user_password);               //通过xml导入sql语句
    List<UserBean> getAll();

    @Select("select * from userinformation where user_id = #{user_id}")     //@Insert @Update @Delete
    UserBean getUserById(@Param("user_id") Integer user_id);                    //通过注解写入sql语句
}
