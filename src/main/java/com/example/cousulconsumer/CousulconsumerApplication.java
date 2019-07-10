package com.example.cousulconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CousulconsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CousulconsumerApplication.class, args);
    }

}
