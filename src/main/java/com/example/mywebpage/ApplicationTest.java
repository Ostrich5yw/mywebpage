package com.example.mywebpage;

import com.example.mywebpage.bean.UserinformationBean;
import com.example.mywebpage.service.UserinformationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {
    @Autowired
    UserinformationService userinformationService;

    @Test
    public void testlogin(){
        UserinformationBean uB = userinformationService.Login("Ostrich5yw", "123");
        System.out.println(uB.getUser_id());
    }
}
