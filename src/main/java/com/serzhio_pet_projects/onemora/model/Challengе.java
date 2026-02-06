package com.serzhio_pet_projects.onemora.model;

import java.util.UUID;

public record Challengе(
        UUID id,
        String title,
        String description,
        int countDays
) {
}
