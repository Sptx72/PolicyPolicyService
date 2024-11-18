package com.policy.policy_service.policy_service.policy.domain.model.coverage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coverage {

    private int id;
    private CoverageType type;


    @Getter
    public enum CoverageType {
        LIFE_ACCIDENTS(50),
        LIFE_DISABILITY(70),
        LIFE_DEATH(100),
        LIFE_CRITICAL_ILLNESS(120),
        LIFE_TERMINAL_ILLNESS(80),

        CAR_COLLISION(200),
        CAR_THEFT(150),
        CAR_FIRE(100),
        CAR_GLASS_DAMAGE(50),
        CAR_ROAD_ASSISTANCE(70),
        CAR_LIABILITY(120),
        CAR_PERSONAL_INJURY(100),

        HEALTH_HOSPITALIZATION(300),
        HEALTH_SURGERY(400),
        HEALTH_DENTAL(200),
        HEALTH_MATERNITY(250),
        HEALTH_AMBULATORY(150),
        HEALTH_CRITICAL_ILLNESS(350),

        HOME_FIRE(100),
        HOME_THEFT(120),
        HOME_WATER_DAMAGE(80),
        HOME_EARTHQUAKE(200),
        HOME_THIRD_PARTY_LIABILITY(90),
        HOME_STRUCTURE(250),
        HOME_CONTENTS(150),

        TRAVEL_CANCELLATION(30),
        TRAVEL_MEDICAL_EXPENSES(100),
        TRAVEL_LOST_LUGGAGE(50),
        TRAVEL_ACCIDENT(80),
        TRAVEL_EMERGENCY_RETURN(90),
        TRAVEL_PERSONAL_LIABILITY(70),

        CIVIL_PROPERTY_DAMAGE(200),
        CIVIL_PERSONAL_INJURY(250),
        CIVIL_LEGAL_EXPENSES(150),
        CIVIL_BUSINESS_LIABILITY(300),

        BUSINESS_FIRE(150),
        BUSINESS_THEFT(200),
        BUSINESS_EMPLOYEE_LIABILITY(250),
        BUSINESS_INTERRUPTION(300),
        BUSINESS_EQUIPMENT_DAMAGE(180),
        BUSINESS_CYBER_ATTACK(220),
        BUSINESS_PUBLIC_LIABILITY(350);

        private final int baseCost;

        CoverageType(int baseCost) {
            this.baseCost = baseCost;
        }

    }

}

