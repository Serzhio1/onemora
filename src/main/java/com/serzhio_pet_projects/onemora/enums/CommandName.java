package com.serzhio_pet_projects.onemora.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum CommandName {
    ABOUT("ABOUT_COMMAND");
    private final String name;

    public String getName() {
        return name;
    }
}
