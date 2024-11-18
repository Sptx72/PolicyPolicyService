package com.policy.policy_service.policy_service.policy.application.service;

import com.policy.policy_service.policy_service.policy.domain.model.user.User;
import com.policy.policy_service.policy_service.policy.infrastructure.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public boolean userExists(UUID userId) {
        return userRepository.userExists(userId);
    }

}
