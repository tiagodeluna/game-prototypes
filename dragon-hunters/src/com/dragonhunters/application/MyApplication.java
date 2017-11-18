package com.dragonhunters.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.dragonhunters.service.*",
		"com.dragonhunters.infrastructure.*"})
public class MyApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
        System.out.println("Running application...");
    }
}
