package com.example.mywebpage.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "test")
@Component("testproperties")
public class testProperties {
    private String indexa;
    private String indexb;
    private String indexc;
}
