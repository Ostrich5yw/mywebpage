package com.example.mywebpage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mywebpage.dao")     //MapperScan负责扫描指定包下的dao接口并生成相应的实现类
//@ComponentScan负责扫描指定路径下的所有@Controller、@Service、@Repository、@Component 的类
//照例来说SpringBootApplication会自动扫描其子目录下的所有文件，这个标签只是为了查找不在其子目录下的文件
public class MywebpageApplication {

    public static void main(String[] args) {
        SpringApplication.run(MywebpageApplication.class, args);
    }

}
