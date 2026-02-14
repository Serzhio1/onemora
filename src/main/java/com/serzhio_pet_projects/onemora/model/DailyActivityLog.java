package com.serzhio_pet_projects.onemora.model;

import com.serzhio_pet_projects.onemora.enums.DailyActivityStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record DailyActivityLog(
        UUID id,
        DailyActivityStatus status,
        LocalDateTime date,
        UUID challengeId
) {
}
