package com.starscape.makestars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MakeStarsApplication {
    public static void main(String[] args) {
        SpringApplication.run(MakeStarsApplication.class, args);
    }
        @Bean
        public CommandLineRunner run() {
            return args -> {
                // TODO: Add code to execute at startup
                System.out.println("MakeStarsApplication CommandLineRunner executed.");
            };
        }

    
}
