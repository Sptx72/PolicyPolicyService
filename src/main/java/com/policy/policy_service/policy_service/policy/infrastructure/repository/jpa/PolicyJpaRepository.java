package com.policy.policy_service.policy_service.policy.infrastructure.repository.jpa;

import com.policy.policy_service.policy_service.policy.infrastructure.model.PolicyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyJpaRepository extends JpaRepository<PolicyEntity, Integer> {}