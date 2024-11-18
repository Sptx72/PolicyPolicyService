package com.policy.policy_service.policy_service.policy.infrastructure.repository;

import com.policy.policy_service.policy_service.policy.application.shared.mapper.coverage.CoverageMapper;
import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import com.policy.policy_service.policy_service.policy.infrastructure.repository.jpa.CoverageJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CoverageRepository {

    private final CoverageJpaRepository coverageJpaRepository;

    public List<Coverage> findCoveragesByIds(List<Integer> coverageIds) {
        return getCoverages().stream().filter(cvg -> coverageIds.contains(cvg.getId())).toList();
    }

    private List<Coverage> getCoverages() {
        return CoverageMapper.fromEntity(coverageJpaRepository.findAll());
    }

}
