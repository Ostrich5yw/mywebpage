package com.example.mywebpage.controller;

import com.example.mywebpage.bean.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource(name = "test")
    private UserBean userBean;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","张三");
        return "Ostrich5yw";
    }

    @ResponseBody
    @RequestMapping("test")
    public UserBean test(){
        return userBean;
    }
}
