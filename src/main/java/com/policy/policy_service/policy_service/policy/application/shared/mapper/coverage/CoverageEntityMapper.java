package com.policy.policy_service.policy_service.policy.application.shared.mapper.coverage;

import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import com.policy.policy_service.policy_service.policy.infrastructure.model.CoverageEntity;

import java.util.List;

public class CoverageEntityMapper {

    public static CoverageEntity fromCoverage(Coverage coverage) {
        return CoverageEntity.builder()
                .type(coverage.getType().name())
                .id(coverage.getId())
                .build();
    }

    public static List<CoverageEntity> fromCoverage(List<Coverage> coverages) {
        return coverages.stream().map(CoverageEntityMapper::fromCoverage).toList();
    }
}
