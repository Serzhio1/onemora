package com.serzhio_pet_projects.onemora.model;

import java.util.UUID;

public record User(
        UUID id,
        String firstName,
        int level
) {
}
