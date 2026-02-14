package com.serzhio_pet_projects.onemora.commands;

import org.telegram.telegrambots.meta.api.objects.Update;

public interface Command {

    boolean canHandle(Update update);

    void process(Update update);

    String getCommand();
}
