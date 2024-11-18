package com.policy.policy_service.policy_service.policy.application.shared.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String message) {
        super(message);
    }

}
