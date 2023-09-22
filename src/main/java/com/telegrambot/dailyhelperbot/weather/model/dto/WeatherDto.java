package com.telegrambot.dailyhelperbot.weather.model.dto;

import com.telegrambot.dailyhelperbot.weather.model.*;
import lombok.Data;

@Data
public class WeatherDto {
    private Coordinate coord;
    private Weather[] weather;
    private String base;
    private MainWeather main;
    private long visibility;
    private Wind wind;
    private Cloud clouds;
    private long dt;
    private SysWeather sys;
    private long timezone;
    private long id;
    private String name;
    private long cod;
}