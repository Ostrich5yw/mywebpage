package com.example.mywebpage;

import com.example.mywebpage.bean.StuBean;
import com.example.mywebpage.service.StuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    StuService stuService;

    @Test
    public void testlogin(){
        StuBean uB = stuService.Login("Ostrich5yw", "123");
        System.out.println(uB.getStu_id());
    }
}
