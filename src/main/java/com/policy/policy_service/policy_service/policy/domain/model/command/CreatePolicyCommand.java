package com.policy.policy_service.policy_service.policy.domain.model.command;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record CreatePolicyCommand(
        UUID userId,
        String insuranceType,
        List<Integer> coverages,
        LocalDate startDate,
        LocalDate endDate
) {
}
