package com.policy.policy_service.policy_service.policy.domain.service;

import com.policy.policy_service.policy_service.policy.application.dto.response.CreatedPolicyResponse;
import com.policy.policy_service.policy_service.policy.application.service.CoverageService;
import com.policy.policy_service.policy_service.policy.application.service.PolicyService;
import com.policy.policy_service.policy_service.policy.application.service.UserService;
import com.policy.policy_service.policy_service.policy.domain.factory.InsuranceFactory;
import com.policy.policy_service.policy_service.policy.domain.factory.PolicyFactory;
import com.policy.policy_service.policy_service.policy.domain.model.command.CreatePolicyCommand;
import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import com.policy.policy_service.policy_service.policy.domain.model.insurance.Insurance;
import com.policy.policy_service.policy_service.policy.domain.model.policy.Policy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class CreatePolicyService {

    private final UserService userService;
    private final CoverageService coverageService;
    private final PolicyService policyService;


    public CreatedPolicyResponse createPolicy(CreatePolicyCommand command) {
        //TODO: Verify if user exists
        //userService.getUserById(command.userId());

        List<Coverage> coverages = coverageService.findCoveragesByIds(command.coverages());

        Insurance insurance = InsuranceFactory.create(command.insuranceType(), coverages);
        Policy policy = PolicyFactory.create(command, insurance);
        return new CreatedPolicyResponse(policyService.save(policy));
    }
}
