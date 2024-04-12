package com.example.cinemabookingapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class CinemaBookingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaBookingAppApplication.class, args);
    }

}
