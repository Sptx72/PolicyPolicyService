package com.policy.policy_service.policy_service.policy.domain.model.policy;

import com.policy.policy_service.policy_service.policy.domain.model.insurance.Insurance;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Policy {

    private PolicyId id;
    private Insurance insurance;
    private Money cost;
    private LocalDate startDate;
    private LocalDate endDate;
    private UUID userId;

    public void calculateCost() {
        int baseCost = insurance.getCoverages().stream().mapToInt(cvg -> cvg.getType().getBaseCost()).sum();
        BigDecimal cost = new BigDecimal(baseCost * insurance.getType().getRiskFactor());

        this.cost = new Money(cost, Money.Denomination.EUR);
    }
}
