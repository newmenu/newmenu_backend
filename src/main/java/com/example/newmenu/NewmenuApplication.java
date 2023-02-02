package com.example.newmenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class NewmenuApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewmenuApplication.class, args);
    }

}
