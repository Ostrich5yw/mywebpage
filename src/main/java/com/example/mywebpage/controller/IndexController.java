package com.example.mywebpage.controller;

import com.example.mywebpage.bean.StuBean;
import com.example.mywebpage.properties.testProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class IndexController {
    @Resource(name = "testconfig")
    private StuBean stuBean;
    @Resource(name = "testproperties")
    private testProperties testProperties;

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("name","张三");
        return "Ostrich5yw";
    }

    @ResponseBody
    @RequestMapping("testconfig")
    public StuBean test(){
        return stuBean;
    }

    @ResponseBody
    @RequestMapping("testproperties")
    public testProperties test2(){ return testProperties; }
}
