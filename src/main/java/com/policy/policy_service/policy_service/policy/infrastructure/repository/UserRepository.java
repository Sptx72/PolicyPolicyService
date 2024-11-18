package com.policy.policy_service.policy_service.policy.infrastructure.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserRepository {

    @PersistenceContext
    EntityManager entityManager;

    public boolean userExists(UUID userId) {
        return (Long) entityManager.createQuery("SELECT count(*) FROM users WHERE id = :id ")
                .setParameter("id", userId)
                .getSingleResult() > 0;
    }
}
