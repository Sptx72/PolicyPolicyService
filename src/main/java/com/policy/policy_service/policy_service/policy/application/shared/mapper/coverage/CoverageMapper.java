package com.policy.policy_service.policy_service.policy.application.shared.mapper.coverage;

import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import com.policy.policy_service.policy_service.policy.infrastructure.model.CoverageEntity;

import java.util.List;

public class CoverageMapper {

    public static List<Coverage> fromEntity(List<CoverageEntity> coverageEntities) {
        return coverageEntities.stream().map(CoverageMapper::fromEntity).toList();
    }

    public static Coverage fromEntity(CoverageEntity entity) {
        return new Coverage(
                entity.getId(),
                Coverage.CoverageType.valueOf(entity.getType())
        );
    }
}
