package com.policy.policy_service.policy_service.policy.domain.model.user;

import com.policy.policy_service.policy_service.policy.domain.model.policy.Policy;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Builder
public class User {

    private UUID id;
    @Builder.Default
    private List<Policy> policies = new ArrayList<>();

}
