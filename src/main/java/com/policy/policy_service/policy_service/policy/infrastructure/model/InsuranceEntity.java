package com.policy.policy_service.policy_service.policy.infrastructure.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "insurances")
public class InsuranceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "type")
    private String type;
    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
        name = "insurances_coverages",
        joinColumns = @JoinColumn(name = "insurance_id"),
        inverseJoinColumns = @JoinColumn(name = "coverage_id")
    )
    private List<CoverageEntity> coverages;

}
