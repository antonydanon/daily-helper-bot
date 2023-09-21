package com.telegrambot.dailyhelperbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class DailyHelperBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(DailyHelperBotApplication.class, args);
    }

}
