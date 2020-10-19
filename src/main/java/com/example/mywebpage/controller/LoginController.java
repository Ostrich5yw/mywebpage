package com.example.mywebpage.controller;

import com.example.mywebpage.bean.StuBean;
import com.example.mywebpage.bean.TeaBean;
import com.example.mywebpage.service.SearchService;
import com.example.mywebpage.service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Autowired
    StuService stuService;
    @Resource
    SearchService searchService;


    @RequestMapping("/log/login")
    public String page(){
        return "log/login";
    }

    @RequestMapping(value = "/form_login", method = RequestMethod.POST)
    public String login(@RequestParam(required=true)String user_name, String user_password){
        StuBean uB = stuService.Login(user_name, user_password);
        System.out.print(user_name+", ");
        System.out.println(user_password);
        if(uB == null)
            return "log/error";
        else {
            return "log/success";
        }
    }
    @CrossOrigin
    @RequestMapping(value = "loginstu", method = RequestMethod.POST)
    @ResponseBody
    public String frontloginstu(@RequestBody StuBean user){
        System.out.println(user.getStu_name()+ " " +user.getStu_password());
        StuBean temp = searchService.stulogin(user.getStu_name(), user.getStu_password());
        System.out.println(temp.getStu_id());
        return "success";
    }
    @CrossOrigin
    @RequestMapping(value = "logintea", method = RequestMethod.POST)
    @ResponseBody
    public String frontlogintea(@RequestBody TeaBean user){
        System.out.println(user.getTea_name()+ " " +user.getTea_password());
        TeaBean temp = searchService.tealogin(user.getTea_name(), user.getTea_password());
        System.out.println(temp.getTea_id());
        return "success";
    }
}
