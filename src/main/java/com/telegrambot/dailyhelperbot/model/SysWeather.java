package com.telegrambot.dailyhelperbot.model;

import lombok.Data;

@Data
public class SysWeather {
    private int type;
    private long id;
    private String country;
    private long sunrise;
    private long sunset;
}
