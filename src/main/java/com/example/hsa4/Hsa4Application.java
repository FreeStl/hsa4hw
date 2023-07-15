package com.example.hsa4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@EnableFeignClients
@EnableScheduling
public class Hsa4Application {
    public static void main(String[] args) {
        SpringApplication.run(Hsa4Application.class, args);
    }
}
