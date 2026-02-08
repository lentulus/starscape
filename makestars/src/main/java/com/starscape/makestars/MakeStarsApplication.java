package com.starscape.makestars;
import dataobjects.DatabaseUtil;

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
            System.out.println("MakeStarsApplication CommandLineRunner executed.");
            // Connect to H2 database using DatabaseUtil and print status
            try {
                Class.forName("org.h2.Driver");
                java.sql.Connection conn = dataobjects.DatabaseUtil.getConnection();
                System.out.println("H2 database connection successful: " + conn.getMetaData().getURL());
                conn.close();
            } catch (Exception e) {
                System.err.println("H2 database connection failed: " + e.getMessage());
            }
        };
    }

    
}
