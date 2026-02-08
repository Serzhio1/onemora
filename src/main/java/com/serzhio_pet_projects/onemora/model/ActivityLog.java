package com.serzhio_pet_projects.onemora.model;

import com.serzhio_pet_projects.onemora.enums.ActivityStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record ActivityLog(
        UUID id,
        ActivityStatus status,
        LocalDateTime date,
        UUID challengeId
) {
}
