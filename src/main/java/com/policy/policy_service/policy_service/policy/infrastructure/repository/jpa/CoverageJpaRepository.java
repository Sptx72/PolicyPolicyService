package com.policy.policy_service.policy_service.policy.infrastructure.repository.jpa;

import com.policy.policy_service.policy_service.policy.infrastructure.model.CoverageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoverageJpaRepository extends JpaRepository<CoverageEntity, Integer> {

    @Query(value = "SELECT * FROM coverages WHERE id IN (?1)", nativeQuery = true)
    List<CoverageEntity> getCoveragesByIds(List<Integer> ids);

}
