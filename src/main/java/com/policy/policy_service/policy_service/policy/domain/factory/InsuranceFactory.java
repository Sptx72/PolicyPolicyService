package com.policy.policy_service.policy_service.policy.domain.factory;

import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import com.policy.policy_service.policy_service.policy.domain.model.insurance.Insurance;

import java.util.List;

public class InsuranceFactory {

    public static Insurance create(String type, List<Coverage> coverages) {
        return Insurance.builder()
                .type(Insurance.InsuranceType.valueOf(type))
                .coverages(coverages)
                .build();
    }
}
