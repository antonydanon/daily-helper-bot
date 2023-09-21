package com.telegrambot.dailyhelperbot.service;

import com.telegrambot.dailyhelperbot.controller.TelegramBotController;
import com.telegrambot.dailyhelperbot.model.dto.WeatherDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

@Service
@RequiredArgsConstructor
public class WeatherService {
    private final static String WEATHER_API = "https://api.openweathermap.org/data/2.5/weather?lat=53.900556&lon=27.557942&appid=";
    private final TelegramBotController telegramBotController;
    @Value("${weather.key}")
    private String key;

    @Scheduled(fixedDelay = 10000)
    public void updateWeather(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<WeatherDto> response = restTemplate
                .getForEntity(WEATHER_API + key, WeatherDto.class);
        WeatherDto weatherDto = response.getBody();

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(654385294L);
        sendMessage.setText("Weather: " + weatherDto.getWeather()[0].getDescription()
                            + "\nTempreture: " + (int)(weatherDto.getMain().getTemp() - 273) + "°C"
                            + "\nFeels like: " + (int)(weatherDto.getMain().getFeels_like() - 273) + "°C"
                            + "\nHumidity : " + (int)weatherDto.getMain().getHumidity() + "%");
        telegramBotController.sendAnswerMessage(sendMessage);
    }
}

//https://home.openweathermap.org/api_keys
