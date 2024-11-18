package com.policy.policy_service.policy_service.policy.application.dto.request;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record CreatePolicyRequest(
        String insuranceType,
        List<Integer> coverages,
        LocalDate startDate,
        LocalDate endDate
) {
}
