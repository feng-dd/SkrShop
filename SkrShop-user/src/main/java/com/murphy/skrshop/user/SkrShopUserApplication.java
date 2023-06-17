package com.murphy.skrshop.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;


//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//TODO：@SpringBootApplication 默认扫描本包和子包，为了防止全局异常类未被扫描到，建议在启动类上加上包扫描
@SpringBootApplication(scanBasePackages = {"com.murphy.skrshop.common","com.murphy.skrshop.user"})
public class SkrShopUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkrShopUserApplication.class, args);
    }

}
