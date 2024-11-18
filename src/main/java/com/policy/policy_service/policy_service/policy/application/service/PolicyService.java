package com.policy.policy_service.policy_service.policy.application.service;

import com.policy.policy_service.policy_service.policy.domain.model.policy.Policy;
import com.policy.policy_service.policy_service.policy.infrastructure.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PolicyService {

    private final PolicyRepository policyRepository;

    public Integer save(Policy policy) {
        return policyRepository.save(policy);
    }
}
