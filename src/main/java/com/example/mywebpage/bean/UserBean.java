package com.example.mywebpage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBean {
    private int user_id;
    private String user_name;
    private String user_password;
    private String user_signinyear;
}
