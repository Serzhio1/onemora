package com.serzhio_pet_projects.onemora.model;

import com.serzhio_pet_projects.onemora.enums.ChallengeStatus;

import java.time.LocalDateTime;
import java.util.UUID;

public record Challenge(
        UUID id,
        String title,
        String description,
        int durationContDays,
        ChallengeStatus status,
        LocalDateTime startDate
) {
}
