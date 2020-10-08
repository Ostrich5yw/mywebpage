package com.example.mywebpage.controller;

import com.example.mywebpage.bean.UserBean;
import com.example.mywebpage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    UserService userService;

    @RequestMapping("/log/login")
    public String page(){
        return "log/login";
    }

    @RequestMapping(value = "/form_login", method = RequestMethod.POST)
    public String login(@RequestParam(required=true)String user_name, String user_password){
        UserBean uB = userService.Login(user_name, user_password);
        System.out.print(user_name+", ");
        System.out.println(user_password);
        if(uB == null)
            return "log/error";
        else {
            return "log/success";
        }
    }
}
