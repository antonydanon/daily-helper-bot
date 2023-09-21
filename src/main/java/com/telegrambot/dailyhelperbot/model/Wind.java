package com.telegrambot.dailyhelperbot.model;

import lombok.Data;

@Data
public class Wind {
    private float speed;
    private float deg;
    private float gust;
}
