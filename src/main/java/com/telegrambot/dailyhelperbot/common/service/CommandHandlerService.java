package com.telegrambot.dailyhelperbot.common.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CommandHandlerService {

    public final Map<String, CommandExecutorService> commandServices;

    public void executeCommand(String command) {
        CommandExecutorService commandService = commandServices.get(command);
    }


}
