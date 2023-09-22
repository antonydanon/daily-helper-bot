package com.telegrambot.dailyhelperbot.common.service;

import com.telegrambot.dailyhelperbot.weather.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("/weather")
@RequiredArgsConstructor
public class WeatherCommandExecutorService implements CommandExecutorService {
    public final WeatherService weatherService;

    @Override
    public void execute() {
        weatherService.getWeather();
    }
}
