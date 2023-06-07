package com.addtech.springbootmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableOpenfeignClients
public class SpringbootmasterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmasterApplication.class, args);
    }


}
