package com.policy.policy_service.policy_service.policy.application.shared.mapper.insurance;

import com.policy.policy_service.policy_service.policy.application.shared.mapper.coverage.CoverageMapper;
import com.policy.policy_service.policy_service.policy.domain.model.insurance.Insurance;
import com.policy.policy_service.policy_service.policy.infrastructure.model.InsuranceEntity;

public class InsuranceMapper {

    public static Insurance fromEntity(InsuranceEntity entity) {
        return Insurance.builder()
                .id(entity.getId())
                .type(Insurance.InsuranceType.valueOf(entity.getType()))
                .coverages(CoverageMapper.fromEntity(entity.getCoverages()))
                .build();
    }

}
