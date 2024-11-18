package com.policy.policy_service.policy_service.policy.application.shared.mapper.insurance;

import com.policy.policy_service.policy_service.policy.application.shared.mapper.coverage.CoverageEntityMapper;
import com.policy.policy_service.policy_service.policy.domain.model.insurance.Insurance;
import com.policy.policy_service.policy_service.policy.infrastructure.model.InsuranceEntity;

public class InsuranceEntityMapper {

    public static InsuranceEntity fromInsurance(Insurance insurance) {
        return InsuranceEntity.builder()
                .id(insurance.getId())
                .type(insurance.getType().name())
                .build();
    }
}
