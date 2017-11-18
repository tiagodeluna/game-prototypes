package com.dragonhunters.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.dragonhunters.model.gameplay.Gameplay;

@SpringBootApplication
@ComponentScan(basePackages={"com.dragonhunters.service",
		"com.dragonhunters.infrastructure",
		"com.dragonhunters.model.gameplay"})
public class MyApplication {
	
    public static void main(String[] args) {
    	ApplicationContext context = SpringApplication.run(MyApplication.class, args);
        System.out.println("Running application...");
        
        Gameplay game = context.getBean(Gameplay.class);
        game.start();
        game.play();
    }
    
}
