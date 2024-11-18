package com.policy.policy_service.policy_service.policy.infrastructure.repository;

import com.policy.policy_service.policy_service.policy.application.shared.mapper.policy.PolicyEntityMapper;
import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import com.policy.policy_service.policy_service.policy.domain.model.policy.Policy;
import com.policy.policy_service.policy_service.policy.infrastructure.model.PolicyEntity;
import com.policy.policy_service.policy_service.policy.infrastructure.repository.jpa.CoverageJpaRepository;
import com.policy.policy_service.policy_service.policy.infrastructure.repository.jpa.PolicyJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PolicyRepository {

    private final PolicyJpaRepository policyJpaRepository;
    private final CoverageJpaRepository coverageRepository;

    public Integer save(Policy policy) {
        PolicyEntity entity = PolicyEntityMapper.fromPolicy(policy);
        entity.getInsurance().setCoverages(coverageRepository.getCoveragesByIds(policy.getInsurance().getCoverages().stream().map(Coverage::getId).toList()));
        return policyJpaRepository.save(entity).getId();
    }

}
