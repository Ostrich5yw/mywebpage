package com.example.mywebpage.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StuBean {
    private int stu_id;
    private String realname;
    private String stu_name;
    private String stu_password;
    private String stu_signinyear;
    private int college_id;
    private int tea_id;
    private String appearance;
}
