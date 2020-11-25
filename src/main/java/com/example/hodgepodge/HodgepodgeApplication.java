package com.example.hodgepodge;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class HodgepodgeApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(HodgepodgeApplication.class)
                .bannerMode(Banner.Mode.OFF)
                .run();
//        SpringApplication.run(HodgepodgeApplication.class, args);
    }

}
