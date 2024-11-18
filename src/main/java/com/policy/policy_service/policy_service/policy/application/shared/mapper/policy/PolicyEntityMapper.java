package com.policy.policy_service.policy_service.policy.application.shared.mapper.policy;

import com.policy.policy_service.policy_service.policy.application.shared.mapper.insurance.InsuranceEntityMapper;
import com.policy.policy_service.policy_service.policy.domain.model.policy.Policy;
import com.policy.policy_service.policy_service.policy.infrastructure.model.PolicyEntity;

import java.util.List;

public class PolicyEntityMapper {

    public static PolicyEntity fromPolicy(Policy policy) {
        return PolicyEntity.builder()
                .startDate(policy.getStartDate())
                .endDate(policy.getEndDate())
                .insurance(InsuranceEntityMapper.fromInsurance(policy.getInsurance()))
                .userId(policy.getUserId())
                .build();
    }

    public static List<PolicyEntity> fromPolicy(List<Policy> policies) {
        return policies.stream().map(PolicyEntityMapper::fromPolicy).toList();
    }
}
