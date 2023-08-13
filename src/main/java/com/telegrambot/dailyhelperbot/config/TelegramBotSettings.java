package com.telegrambot.dailyhelperbot.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class TelegramBotSettings {

    @Value("${bot.name}")
    private String botName;

    @Value("${bot.token}")
    private String token;
}
