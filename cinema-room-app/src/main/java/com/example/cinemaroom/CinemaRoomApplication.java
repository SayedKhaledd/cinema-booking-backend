package com.example.cinemaroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class CinemaRoomApplication {

    public static void main(String[] args) {
        SpringApplication.run(CinemaRoomApplication.class, args);
    }

}
