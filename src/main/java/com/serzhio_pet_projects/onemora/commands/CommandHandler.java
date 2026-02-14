package com.serzhio_pet_projects.onemora.commands;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Collection;

@RequiredArgsConstructor
@Component
public class CommandHandler {

    private final Collection<Command> commands;

    public void handle(Update update) {
        for (Command command : commands) {
            if (command.canHandle(update)) {
                command.process(update);
            }
        }
    }
}
