package com.example.mywebpage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   //Getter,Setter,equals,canEqual,hasCode,toString
@NoArgsConstructor      //无参构造
@AllArgsConstructor     //全参构造
public class UserBean {
    private int user_id;
    private String user_name;
    private String user_password;
    private String user_signinyear;
}
