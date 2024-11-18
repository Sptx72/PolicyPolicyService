package com.policy.policy_service.policy_service.policy.application.shared.mapper.policy;

import com.policy.policy_service.policy_service.policy.application.shared.mapper.insurance.InsuranceMapper;
import com.policy.policy_service.policy_service.policy.domain.model.policy.Policy;
import com.policy.policy_service.policy_service.policy.domain.model.policy.PolicyId;
import com.policy.policy_service.policy_service.policy.infrastructure.model.PolicyEntity;

import java.util.List;

public class PolicyMapper {

    public static Policy fromEntity(PolicyEntity entity) {
        Policy policy = new Policy();

        policy.setId(new PolicyId(entity.getId()));
        policy.setInsurance(InsuranceMapper.fromEntity(entity.getInsurance()));
        policy.calculateCost();
        policy.setStartDate(entity.getStartDate());
        policy.setEndDate(entity.getEndDate());
        policy.setUserId(entity.getUserId());

        return policy;
    }

    public static List<Policy> fromEntity(List<PolicyEntity> entities) {
        return entities.stream().map(PolicyMapper::fromEntity).toList();
    }

}
