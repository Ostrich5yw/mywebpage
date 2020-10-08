package com.example.mywebpage.controller;
import com.example.mywebpage.service.UpdateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UpdateUserController {
    @Autowired
    UpdateUserService updateUserService;

    @RequestMapping("/log/updateUser")
    public String page(){
        return "log/updateUser";
    }

    @RequestMapping(value = "/form_update", method = RequestMethod.POST)
    public String updateUser(String user_name, String user_password){
        updateUserService.Update(user_name, user_password);
        return "log/success";
    }
}

