package com.example.mywebpage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeaBean {
    private int tea_id;
    private String realname;
    private String tea_name;
    private String tea_password;
    private int college_id;
}
