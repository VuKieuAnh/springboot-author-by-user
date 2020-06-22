package com.codegym.wdbsspringboot;

import com.codegym.wdbsspringboot.config.WebSecurity;
import com.codegym.wdbsspringboot.service.taskservice.ITaskService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class WdbsspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WdbsspringbootApplication.class, args);
    }

}
