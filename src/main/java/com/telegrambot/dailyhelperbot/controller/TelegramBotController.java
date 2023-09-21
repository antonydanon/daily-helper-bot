package com.telegrambot.dailyhelperbot.controller;

import com.telegrambot.dailyhelperbot.config.TelegramBotSettings;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
@RequiredArgsConstructor
public class TelegramBotController extends TelegramLongPollingBot {

    private final TelegramBotSettings telegramBotSettings;
    @Override
    public String getBotUsername() {
        return telegramBotSettings.getBotName();
    }

    @Override
    public String getBotToken() {
        return telegramBotSettings.getToken();
    }

    @Override
    public void onUpdateReceived(Update update) {
            Message message = update.getMessage();
            System.out.println(message.getText());

            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(message.getChatId());
            sendMessage.setText("Hello from bot!");
            sendAnswerMessage(sendMessage);
    }

    public void sendAnswerMessage(SendMessage message) {
        if(message != null) {
            try {
                execute(message);
            } catch (TelegramApiException e) {
                System.out.println(e);
            }
        }
    }
}
