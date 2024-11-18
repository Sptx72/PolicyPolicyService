package com.policy.policy_service.policy_service.policy.application.service;

import com.policy.policy_service.policy_service.policy.domain.model.coverage.Coverage;
import com.policy.policy_service.policy_service.policy.infrastructure.repository.CoverageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoverageService {

    private final CoverageRepository coverageRepository;

    //TODO: Change to remote call
    public List<Coverage> findCoveragesByIds(List<Integer> coverages) {
        return coverageRepository.findCoveragesByIds(coverages);
    }
}
