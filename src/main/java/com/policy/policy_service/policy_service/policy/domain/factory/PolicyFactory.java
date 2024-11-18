package com.policy.policy_service.policy_service.policy.domain.factory;

import com.policy.policy_service.policy_service.policy.domain.model.command.CreatePolicyCommand;
import com.policy.policy_service.policy_service.policy.domain.model.insurance.Insurance;
import com.policy.policy_service.policy_service.policy.domain.model.policy.Policy;
import org.springframework.stereotype.Component;

@Component
public class PolicyFactory {

    public static Policy create(CreatePolicyCommand command, Insurance insurance) {
        Policy policy = new Policy();
        policy.setInsurance(insurance);
        policy.calculateCost();
        policy.setStartDate(command.startDate());
        policy.setEndDate(command.endDate());
        policy.setUserId(command.userId());

        return policy;
    }

}
