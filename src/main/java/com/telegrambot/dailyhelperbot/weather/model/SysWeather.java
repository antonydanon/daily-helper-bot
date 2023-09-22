package com.telegrambot.dailyhelperbot.weather.model;

import lombok.Data;

@Data
public class SysWeather {
    private int type;
    private long id;
    private String country;
    private long sunrise;
    private long sunset;
}
