package com.policy.policy_service.policy_service.policy.infrastructure.controller;

import com.policy.policy_service.policy_service.policy.application.dto.request.CreatePolicyRequest;
import com.policy.policy_service.policy_service.policy.application.dto.response.CreatedPolicyResponse;
import com.policy.policy_service.policy_service.policy.domain.model.command.CreatePolicyCommand;
import com.policy.policy_service.policy_service.policy.domain.service.CreatePolicyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/policies")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class PolicyController {

    private final CreatePolicyService createPolicyService;

    @PostMapping("/users/{userId}")
    public ResponseEntity<CreatedPolicyResponse> createPolicy(
            @PathVariable("userId") UUID userId,
            @RequestBody CreatePolicyRequest request
            ) {
        return ResponseEntity.status(HttpStatus.CREATED).body(createPolicyService.createPolicy(
                new CreatePolicyCommand(
                        userId,
                        request.insuranceType(),
                        request.coverages(),
                        request.startDate(),
                        request.endDate()
                )
        ));
    }

}
