package com.telegrambot.dailyhelperbot.model;

import lombok.Data;

@Data
public class MainWeather {
    private float temp;
    private float feels_like;
    private float temp_min;
    private float temp_max;
    private float pressure;
    private float humidity;
    private float sea_level;
    private float grnd_level;
}
