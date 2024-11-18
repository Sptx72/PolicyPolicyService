package com.policy.policy_service.policy_service.policy.domain.model.insurance;

import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {

    private int id;
    private InsuranceType type;
    private List<Coverage> coverages;

    @Getter
    public enum InsuranceType {
        LIFE(1.1),
        CAR(1.2),
        HEALTH(1.3),
        HOME(1.0),
        TRAVEL(1.15),
        CIVIL_RESPONSIBILITY(1.25),
        BUSINESS(1.35);

        final double riskFactor;

        InsuranceType(double riskFactor) {
            this.riskFactor = riskFactor;
        }

    }

}
